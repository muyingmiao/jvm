package com.wxx.jvm;

public class Demo08 {
    /**
     * 测试 java虚拟机栈溢出
     * java -XX:NewSize=209715200 -XX:MaxNewSize=209715200 -XX:InitialHeapSize=314572800 -XX:MaxHeapSize=314572800
     * -XX:ThreadStackSize=1m
     * -XX:SurvivorRatio=2 -XX:MaxTenuringThreshold=15 -XX:PretenureSizeThreshold=20971520 -XX:+UseParNewGC
     * -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log -jar jvm-1.0-SNAPSHOT.jar
     * @param args
     */
    public static long counter = 0;
    public static void main(String[] args) throws InterruptedException {
        work();

    }
    private static void work() {
        System.out.println("目前是调用" + (++counter ) + "次调用方法");
        work();
    }
}
