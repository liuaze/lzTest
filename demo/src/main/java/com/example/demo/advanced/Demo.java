package com.example.demo.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Demo {

    private String name;

    private String code;

    private Boolean b;

    private boolean a;

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public Boolean getB() {
        return b;
    }

    public void setB(Boolean b) {
        this.b = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static void test(){

    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();

        }
    }

    public static void getTest(){

    }


}

/**
 * 测试static的方法是否可以重写
 * 答案是：不可以。
 *
 * 首先明确一点，在子类中重写父类的static方法，是不会报错的，编译也可以通过，但是在通过一个声明为父类，
 * 实际类型为子类的引用变量调用该方法时，发现被调用的仍是父类中原本以为会被覆盖的方法，不具有“多态”特性。
 *
 *
 */
class Sun extends Demo{

    public static void getTest(){

    }

}
