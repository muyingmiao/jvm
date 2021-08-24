package com.wxx.jvm;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Demo07 {
    /**
     * 测试metapsace溢出
     * java -XX:NewSize=209715200 -XX:MaxNewSize=209715200 -XX:InitialHeapSize=314572800 -XX:MaxHeapSize=314572800
     * -XX:SurvivorRatio=2 -XX:MaxTenuringThreshold=15 -XX:PretenureSizeThreshold=20971520 -XX:+UseParNewGC
     * -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log -jar jvm-1.0-SNAPSHOT.jar
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        long counter = 0;
        while (true){
            System.out.println("目前创建了" + (++counter ) + "个Car的子类");
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Car.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    if(method.getName().equals("run")){
                        System.out.println("汽车启动前，先进行安全检查");
                        return methodProxy.invoke(o, objects);
                    }else{
                        return methodProxy.invoke(o, objects);
                    }
                }
            });
            Car car = (Car) enhancer.create();
            car.run();
        }

    }
    public static class Car {
        public void run(){
            System.out.println("汽车启动，开始行使....");
        }
    }
}
