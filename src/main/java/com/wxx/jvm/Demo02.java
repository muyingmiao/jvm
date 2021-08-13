package com.wxx.jvm;

public class Demo02 {
    public static void main(String[] args) {

        byte[] array1 = new byte[2*1024* 1024];
        array1 = new byte[2*1024* 1024];
        array1 = new byte[2*1024* 1024];
        array1 = null;
        byte[] array2= new byte[128 * 1024];
        byte[] array3 = new byte[2*1024* 1024]; // 第一次YGC
        array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[2 * 1024 * 1024];
        array3 = new byte[128 * 1024];
        array3 = null;
        byte[] array4 = new byte[2 * 1024 * 1024]; // 第二次YGC
/**
 *  045、动手实验：自己动手模拟出对象进入老年代的场景体验一下（上） 动态年龄判断机制 ************
 * Java HotSpot(TM) 64-Bit Server VM (25.211-b12) for windows-amd64 JRE (1.8.0_211-b12), built on Apr  1 2019 20:53:26 by "java_re" with MS VC++ 10.0 (VS2010)
 * Memory: 4k page, physical 16676452k(7036992k free), swap 33352904k(14807576k free)
 * CommandLine flags: -XX:InitialHeapSize=20971520 -XX:MaxHeapSize=20971520 -XX:MaxNewSize=10485760 -XX:MaxTenuringThreshold=15 -XX:NewSize=10485760 -XX:OldPLABSize=16 -XX:PretenureSizeThreshold=10485760 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:SurvivorRatio=8 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
 * 0.103: [GC (Allocation Failure) 0.103: [ParNew: 7255K->707K(9216K), 0.0007219 secs] 7255K->707K(19456K), 0.0008559 secs]
 * [Times: user=0.00 sys=0.00, real=0.00 secs]
 *
 * 0.104: [GC (Allocation Failure) 0.104: [ParNew: 7011K->0K(9216K), 0.0119400 secs] 7011K->680K(19456K), 0.0120119 secs]
 * [Times: user=0.00 sys=0.00, real=0.01 secs]
 * Heap
 *  par new generation   total 9216K, used 2212K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   eden space 8192K,  27% used [0x00000000fec00000, 0x00000000fee290e0, 0x00000000ff400000)
 *   from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 *   to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
 *  concurrent mark-sweep generation total 10240K, used 680K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *  Metaspace       used 2745K, capacity 4486K, committed 4864K, reserved 1056768K
 *   class space    used 301K, capacity 386K, committed 512K, reserved 1048576K
 */

    }
}
