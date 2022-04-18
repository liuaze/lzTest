package com.example.demo.leetcode;


import java.util.Random;

/**
 *
 * 已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。
 *
 * 不要使用系统的 Math.random() 方法。
 *
 * <<n位移 表示*2的n次方

 */
public class Rand{


    static String s;

    public int rand7(){
        Random random = new Random();
        return random.nextInt(7)+1;
    }


    public int rand10(final Object q ) {
        int res;
        do {
            //8+4+2+1可得的0-15等概率数
            res = (rand01() << 3) + (rand01() << 2) + (rand01() << 1) + rand01();
        } while (res > 9);
        return res + 1;
    }

    public int rand01() {
        int res;
        do {

            res = rand7();
        } while (res == 4);
        //随机数大于4和小于4的概率相等
        return res < 4 ? 0 : 1;
    }




    public static void main(String[] args) {
        Rand rand = new Rand();
        for(int i = 0 ; i<30 ;i++){
            System.out.println(rand.rand01());
        }

        System.out.println( 0 << 3);
        System.out.println( 1 << 3);
        System.out.println(0 << 2);
        System.out.println(1 << 0);
    }


}
