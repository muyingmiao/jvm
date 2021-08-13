package com.wxx.jvm;

public class Demo06 {
    /**
     * 调整前：java -XX:NewSize=104857600 -XX:MaxNewSize=104857600 -XX:InitialHeapSize=209715200 -XX:MaxHeapSize=209715200 -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15 -XX:PretenureSizeThreshold=20971520 -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log -jar jvm-1.0-SNAPSHOT.jar
     * 调整后：java -XX:NewSize=209715200 -XX:MaxNewSize=209715200 -XX:InitialHeapSize=314572800 -XX:MaxHeapSize=314572800 -XX:SurvivorRatio=2 -XX:MaxTenuringThreshold=15 -XX:PretenureSizeThreshold=20971520 -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log -jar jvm-1.0-SNAPSHOT.jar
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(30000);
        while (true){
            loadData();
        }

    }
    private static void loadData() throws InterruptedException {
        byte[] data = null;
        for(int i =0 ; i< 4; i++){
            data = new byte[10 * 1024 * 1024];
        }
        data = null; // 40M 无效的

        byte[] data1 = new byte[10 * 1024 * 1024]; //50M
        byte[] data2 = new byte[10 * 1024 * 1024]; // 60M

        byte[] data3 = new byte[10 * 1024*1024]; //70M
        data3 = new byte[10 * 1024 * 1024]; //80M
        Thread.sleep(1000);
    }
}
