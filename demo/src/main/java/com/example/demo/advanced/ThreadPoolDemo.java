package com.example.demo.advanced;


import java.util.concurrent.TimeUnit;

class DieLockDemo implements Runnable {
    private String lockA;
    private String lockB;

    public DieLockDemo(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {

        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "+++++自己是：" + lockA + "想获取：" + lockB);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "+++++自己是：" + lockB + "想获取：" + lockA);
            }
        }

    }
}

/**
 * 模拟死锁，多个线程互相占用对方资源
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        //获取服务器的cpu数量
        //System.out.println(Runtime.getRuntime().availableProcessors());
        //死锁
       /* String lockA = "aaa";
        String lockB = "bbb";
        new Thread(new DieLockDemo(lockA,lockB),"AAAAAAAAAAAAAAA").start();
        new Thread(new DieLockDemo(lockB,lockA),"BBBBBBBBBBBBBBB").start();*/

        /*long totalMemory = Runtime.getRuntime().totalMemory();//虚拟机总内存
        long maxMemory = Runtime.getRuntime().maxMemory();//虚拟机试图使用最大内存
        System.out.println("-xms:"+totalMemory+"字节,"+(totalMemory/(double)1024/1024)+"m");
        System.out.println("-xmx:"+maxMemory+"字节,"+(maxMemory/(double)1024/1024)+"m");*/
        //-Xms10m  -Xmx10mm 模拟堆溢出
        byte[] bytes = new byte[11 * 1024 * 1024];
        //模拟虚引用及引用队列
        /*Object o1 = new Object();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        PhantomReference<Object> phantomReference = new PhantomReference<>(o1,referenceQueue);

        System.out.println(phantomReference.get());//null
        System.out.println(referenceQueue.poll());//null

        System.out.println("+++++++++++++++++++++++++");

        o1 = null ;
        System.gc();
        System.out.println(phantomReference.get());//null
        System.out.println(referenceQueue.poll());//java.lang.ref.PhantomReference@29444d75*/


    }

}
