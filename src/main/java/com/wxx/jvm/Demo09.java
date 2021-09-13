package com.wxx.jvm;

import java.util.ArrayList;
import java.util.List;

public class Demo09 {
    /**
     * 测试 堆内存溢出
     * -Xms10m -Xmx10m
     * java -XX:NewSize=209715200 -XX:MaxNewSize=209715200 -XX:InitialHeapSize=314572800 -XX:MaxHeapSize=314572800
     * -XX:ThreadStackSize=1m
     * -XX:SurvivorRatio=2 -XX:MaxTenuringThreshold=15 -XX:PretenureSizeThreshold=20971520 -XX:+UseParNewGC
     * -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log -jar jvm-1.0-SNAPSHOT.jar
     * -Xms10m
     *      * -Xmx10m
     *      * -XX:+PrintGCDetials
     *      * -XLoggc:gc.log
     *      * -XX:+HeapDumpOnOutOfMemoryError
     *      * -XX:HeapDumpPath=./
     *      * -XX:+UseParNewGC
     *      * -XX:+UseConcMarkSweepGC
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        long counter = 0;
        List<Object> list = new ArrayList<Object>();
        while(true){
            list.add(new Object());
        }

    }

}
