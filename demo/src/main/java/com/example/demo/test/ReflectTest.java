package com.example.demo.test;

import java.lang.reflect.Field;

/**
 * Stirng s
 * 经过操作使s的值发生变化
 *
 */
public class ReflectTest {


    public static void main(String[] args) {
        String s = "abc";
        try {
            Field value = s.getClass().getDeclaredField("value");
            value.setAccessible(true);
            value.set(s,"abcd".toCharArray());

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(s);
    }
}
