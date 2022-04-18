package com.example.demo.advanced;

public class SingletonDemo {
    private static volatile SingletonDemo instance = null;

    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + "\t 构造方法");
    }

    /**
     * 双重检测机制     * @return
     */
    public static SingletonDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }
    //使用静态内部类实现单例
    private static class SingletonInner {
        private static SingletonDemo singletonStaticInner = new SingletonDemo();
    }

    //静态代码块
    static {
        instance = new SingletonDemo();
    }


    //枚举实现单例
    enum SinletonEnum{

        INSTANCE;

        private SingletonDemo singletonDemo;

        SinletonEnum(){
            singletonDemo = new SingletonDemo();
        }

        public SingletonDemo  get(){
            return singletonDemo;
        }


    }





    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                SingletonDemo.getInstance();
            }, String.valueOf(i)).start();
        }
    }

}

