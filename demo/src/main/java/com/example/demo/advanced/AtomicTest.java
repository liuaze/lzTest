package com.example.demo.advanced;

import javassist.LoaderClassPath;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * integer
 */
class MyData {


    public static int num = 0;

    public void add() {

        num++;
        System.out.println(Thread.currentThread().getName() + "_" + num);
    }

    public void decrease() {
        num--;

        System.out.println(Thread.currentThread().getName() + "_" + num);
    }

    public void to60() {
        num = 60;
    }

    public int get() {
        return num;
    }

}

/**
 * 原子integer
 */
class MyAtomicData {
    public static volatile AtomicInteger num = new AtomicInteger(0);

    public void add() {
        num.getAndIncrement();
        System.out.println(Thread.currentThread().getName() + "_" + num);
    }

    public void decrease() {
        num.getAndDecrement();
        System.out.println(Thread.currentThread().getName() + "_" + num);
    }


    public AtomicInteger get() {
        return num;
    }


}


/**
 * 测试原子性
 */
public class AtomicTest {



    Lock lock = new ReentrantLock();
    public static void main(String[] args) {
       /* lock.tryLock();
        Condition condition = lock.newCondition();
        condition.await();
        condition.signal();
        lock.lock();
        lock.unlock();*/

        //测试++--
        MyAtomicData myAtomicData = new MyAtomicData();
        MyData myData = new MyData();
        for (int i = 1; i <= 100; i++) {
            int finalI = i;
            new Thread(() -> {
                for (int j = 1; j <= 100; j++) {
                    myData.add();
                    //myAtomicData.add();
                }
            }, "a").start();

            new Thread(() -> {
                for (int j = 1; j <= 100; j++) {
                    myData.decrease();
                    myAtomicData.decrease();
                }
            }, "b").start();
        }
        //保证上面操作执行完
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("++++++++myData++++++++" + myData.get());
        System.out.println("+++++++++myAtomicData+++++++" + myAtomicData.get());


    }


}

class NumTask implements Callable {
    int i;

    NumTask(int i) {
        this.i = i;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + i);
        i++;
        return null;
    }
}

class NumRun implements Runnable {

    int i;

    NumRun(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        synchronized (NumRun.class){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                notifyAll();
            }
            System.out.println(Thread.currentThread().getName() + i);
            i--;
        }

    }
}

