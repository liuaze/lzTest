package com.example.demo.advanced;

import java.util.HashSet;
import java.util.Set;

public class Sum {


    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() <= 1) {
            return originStr;
        }
        String s = reverse(originStr.substring(1)) + originStr.charAt(0);
        return s;
    }


    public static void main(String[] args) {

        /*int[] arr ={1,-2,3,5,6,-3};
        int i = maxSum(arr);*/

        Set set = new HashSet<>();
        boolean add = set.add(1);
        boolean add1 = set.add(1);
        System.out.println(add + "" + add1);

    }


    public static int maxSum(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        int cut = 0;

        for (int i = 0; i != arr.length; i++) {

            cut += arr[i];

            max = Math.max(max, cut);

            cut = cut < 0 ? 0 : cut;

        }

        return max;


    }


}
