package com.example.demo.advanced;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Demo2 {
    Lock lock = new ReentrantLock();

    public void get() {
        lock.lock();
        try {
            System.out.println("get++++++++++++++++++++++");
            set();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void set() {
        lock.lock();
        try {
            System.out.println("set++++++++++++++++++++++");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}


/**
 * 模拟可重入锁（递归锁）
 */
public class ReentranLockDemo {
    public static void main(String[] args) {

        Demo2 demo2 = new Demo2();

        new Thread(() -> {
            demo2.get();
        }, "aa").start();
    }


}
