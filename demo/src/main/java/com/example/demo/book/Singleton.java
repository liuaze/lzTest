package com.example.demo.book;

/**
 * 类加载
 */
public class Singleton {

    private static Singleton instance = new Singleton();//2

    private static int x = 0;
    private static int y;

    private Singleton() {
        x++;
        y++;
    }

    public static Singleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        //Singleton singleton =  Singleton.getInstance();
        System.out.println(Singleton.x);
        System.out.println(Singleton.y);
    }


}
