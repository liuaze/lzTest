package com.example.demo.advanced;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 模拟自旋锁，线程不阻塞，通过循环对比知道成功为止
 */
public class SpinLockDemo {

    AtomicReference<Thread> atomicReference = new AtomicReference();

    //上锁
    public void myLock() {
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + "myLock");
        //如果主内存中不为null，则返回false，一直循环
        while (!atomicReference.compareAndSet(null, thread)) {
            System.out.println(Thread.currentThread().getName() + "myLock***********");
        }
    }

    //解锁
    public void myUnLock() {
        Thread thread = Thread.currentThread();
        //如果主内存中为thread，则置为null
        atomicReference.compareAndSet(thread, null);
        System.out.println(Thread.currentThread().getName() + "myUnLock");
    }


    public static void main(String[] args) {

        SpinLockDemo spinLockDemo = new SpinLockDemo();

        new Thread(() -> {
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLockDemo.myUnLock();
        }, "aa").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            spinLockDemo.myLock();

            spinLockDemo.myUnLock();
        }, "bb").start();


    }


}
