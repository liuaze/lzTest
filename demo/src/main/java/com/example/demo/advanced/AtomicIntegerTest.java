package com.example.demo.advanced;


import javax.lang.model.element.VariableElement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.ReentrantLock;

class Data {

    public static AtomicInteger num = new AtomicInteger(1500);

    Data() {
    }

    public void sell() {
        if (num.get() > 0) {
            System.out.println(Thread.currentThread() + "---" + num.getAndDecrement());
        }
    }
}


class Data1 {

    ReentrantLock lock = new ReentrantLock();
    public int num = 30000;

    Data1() {
    }

    public void sell() {
        if (num > 0) {
            lock.lock();
            try {
                if (num > 0) {
                    System.out.println(Thread.currentThread() + "---" + (num--) + "--" + System.currentTimeMillis());
                }
            } finally {
                lock.unlock();
            }
        }
    }
}


/**
 * 抢资源操作
 */

public class AtomicIntegerTest {

    public static void main(String[] args) {
        Data data = new Data();
        long start = System.currentTimeMillis();
        System.out.println("开始:" + start);
        for (int j = 1; j <= 3; j++) {
            new Thread(() -> {
                for (int i = 1; i <= 15000; i++) {
                    data.sell();
                }
            }, j + "").start();
        }
        long end = System.currentTimeMillis();
        System.out.println("结束:" + (end - start));


    }


}




