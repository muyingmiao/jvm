package com.wxx.jvm;

public class Demo01 {
    public static void main(String[] args) {

        byte[] array1 = new byte[1024* 1024];
        array1 = new byte[1024* 1024];
        array1 = new byte[1024* 1024];
        array1 = null;

        byte[] array2 = new byte[2*1024* 1024];
/**
 *  043、动手实验：自己动手模拟出频繁Young GC的场景体验一下 ************
 *
 * Java HotSpot(TM) 64-Bit Server VM (25.211-b12) for windows-amd64 JRE (1.8.0_211-b12), built on Apr  1 2019 20:53:26 by "java_re" with MS VC++ 10.0 (VS2010)
 * Memory: 4k page, physical 16676452k(2498664k free), swap 33352904k(6123264k free)
 * CommandLine flags: -XX:InitialHeapSize=10485760 -XX:MaxHeapSize=10485760 -XX:MaxNewSize=5242880 -XX:NewSize=5242880
 * -XX:OldPLABSize=16 -XX:PretenureSizeThreshold=10485760 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps
 * -XX:SurvivorRatio=8 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
 * 0.126: [GC (Allocation Failure)
 * 0.127: [ParNew: 4087K->512K(4608K), 0.0047156 secs] 4087K->728K(9728K), 0.0057453 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
 * Heap
 *  par new generation   total 4608K, used 2601K [0x00000000ff600000, 0x00000000ffb00000, 0x00000000ffb00000)
 *   eden space 4096K,  51% used [0x00000000ff600000, 0x00000000ff80a558, 0x00000000ffa00000)
 *   from space 512K, 100% used [0x00000000ffa80000, 0x00000000ffb00000, 0x00000000ffb00000)
 *   to   space 512K,   0% used [0x00000000ffa00000, 0x00000000ffa00000, 0x00000000ffa80000)
 *  concurrent mark-sweep generation total 5120K, used 216K [0x00000000ffb00000, 0x0000000100000000, 0x0000000100000000)
 *  Metaspace       used 2793K, capacity 4486K, committed 4864K, reserved 1056768K
 *   class space    used 308K, capacity 386K, committed 512K, reserved 1048576K
 */

    }
}
