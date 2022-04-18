package com.example.demo.advanced;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * list测试
 */
public class ListTest {

    public static void main(String[] args) {
        //List<String> list = new ArrayList();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        //Vector list = new Vector();
        for (int i = 1; i <= 100; i++) {
            int finalI = i;
            new Thread(() -> {
                list.add(String.valueOf(finalI));
            }, String.valueOf(i)).start();

        }
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size() + "-------" + list);
    }


}
