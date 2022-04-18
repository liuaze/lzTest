package com.example.demo.advanced;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class MySource {

    private volatile Boolean flag = true;

    AtomicInteger atomicInteger = new AtomicInteger();

    BlockingQueue blockingqueue = null;

    MySource(BlockingQueue blockingqueue) {
        this.blockingqueue = blockingqueue;
    }

    public void myProduct() {
        String data = null;
        while (flag) {
            data = atomicInteger.incrementAndGet() + "";
            try {
                boolean offer = blockingqueue.offer(data, 2L, TimeUnit.SECONDS);
                if (offer) {
                    System.out.println("myProduct+blockingqueue" + data + "成功");
                } else {
                    System.out.println("myProduct+blockingqueue" + data + "失败");
                }
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("myProduct+blockingqueue停止" + flag);
    }

    public void myCustomer() {
        while (flag) {
            try {
                Object poll = blockingqueue.poll(2L, TimeUnit.SECONDS);

                if (poll == null || "".equals(poll)) {
                    flag = false;
                    System.out.println("myCustomer+blockingqueue" + poll + "失败");
                    return;
                } else {
                    System.out.println("myCustomer+blockingqueue" + poll + "成功");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void boss() {
        flag = false;
        System.out.println("MySource+flag:" + flag + "成功");

    }

}


/**
 * 队列模拟消费者和生产着
 */
public class QueueDemo {

    public static void main(String[] args) {
        MySource mySource = new MySource(new ArrayBlockingQueue(3));
        new Thread(() -> {

            mySource.myProduct();


        }, "product").start();

        new Thread(() -> {

            mySource.myCustomer();


        }, "customer").start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mySource.boss();

    }

}
