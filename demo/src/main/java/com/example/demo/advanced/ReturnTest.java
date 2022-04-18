package com.example.demo.advanced;

/**
 * 测试执行顺序
 */
public class ReturnTest {

    public String  test(){

        String  s = "1";

        try {
            s = "2";
            return s;
        } finally {
            s = "3";
        }



    }


    public static void main(String[] args) {
        ReturnTest returnTest = new ReturnTest();
        String test = returnTest.test();
        System.out.println(test);
    }

}
