package com.example.demo.test;



class Prient{

    public int add(){
        return 4;
    }
}

/**
 *
 *
 *
 * 字符串反转
 */
public class StringReverseTest  {

    public long add(){
        return 5;
    }

    public volatile String[] strings;

    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1){
            return originStr;
        }
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    public static void main(String[] args) {
        //String reverse = reverse("1234");
        String s = "1234";
        char c = s.charAt(0);
        System.out.println(c);

        String substring = s.substring(1);
        System.out.println(substring);
    }

}
