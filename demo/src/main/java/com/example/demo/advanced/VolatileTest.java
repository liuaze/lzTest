package com.example.demo.advanced;

import java.util.concurrent.TimeUnit;

/**
 * 测试线程间可见性
 *
 *
 *
 */
public class VolatileTest {

    public  static volatile   String string = null;

    public static void main(String[] args) {


        //Demo1 demo1 = new Demo1();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Demo1.string1 = "test";
            //demo1.update();
            string = "test";
            //System.out.println("test"+demo1.a+demo1.string1);
            System.out.println("--"+string);
        },   "a").start();


        while (string == null){

           //System.out.println("ok");

        }

        System.out.println("out");


        /*new Thread(() -> {


            System.out.println("out");
        },   "b").start();*/
    }


    }


class Demo1{
       String string1 = null;

      int a = 0;

    public  void update(){
        a = 60;
        string1 += "test";
    }

    /*public int geta(){
        return a;
    }*/




}

