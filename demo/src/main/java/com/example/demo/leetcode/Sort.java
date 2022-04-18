package com.example.demo.leetcode;


import org.apache.commons.collections.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 数组排序
 */
public class Sort {

    //插入排序法
    public int[] insertSort(int[] str){
        if(str.length > 1){
            for(int i = 1; i < str.length;i++){
                int a = str[i];
                int j = i-1;
                //str[j]比a大时，将str[j]的值后移
                while (j >= 0 && str[j] < a){
                    str[j+1] = str[j];
                    j--;
                }
                //a放到最前面
                str[j+1] = a;
            }
        }
        return str;
    }




    public static void main(String[] args) {
        int[] str = new int[]{3,7,4,1,2,2,5};
        Sort sort = new Sort();
        int[] ints = sort.insertSort(str);
        for (int anInt : ints) {

            System.out.println(anInt);
        }
        IntStream stream = Arrays.stream(str);
        Stream<Integer> boxed = stream.boxed();
        List<Integer> collect = boxed.collect(Collectors.toList());

        Set<Integer> set = new HashSet<>(collect);
        System.out.println();
    }

}
