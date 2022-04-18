package com.example.demo.arithmetic;


import jdk.nashorn.internal.runtime.arrays.IteratorAction;

/**
 * 稀疏数组模拟。
 * 稀疏数组：二维数组中大部分数据相同，可用稀疏数组记录
 * 示例：五子棋记录
 *
 *
 */
public class SparseArray {

    public static void main(String[] args) {

        //记录有效数据个数
        int sum = 0;

        //1、原始二维数组 0：没有棋子，1:黑子，2:白子
        int chessArray[][] = new int[11][11];
        chessArray[1][3]=1;
        chessArray[2][4]=2;
        //数组打印
        for (int[] row : chessArray) {
            for (int data : row) {
                if(data != 0){
                    sum++;
                }
                System.out.print(data+" ");
            }
            System.out.println();
        }


        //2、转为稀疏数组
        int sparseArray[][] = new int[sum+1][3];
        sparseArray[0][0] = chessArray.length;
        sparseArray[0][1] = chessArray[0].length;
        sparseArray[0][2] = sum;

        //记录稀疏数组行数
        int count = 0;

        for(int i = 0; i < chessArray.length; i++){
            for(int j = 0; j < chessArray[i].length; j ++){
                if(chessArray[i][j] != 0){
                    count++;
                 sparseArray[count][0] = i;
                 sparseArray[count][1] = j;
                 sparseArray[count][2] = chessArray[i][j];
                }
            }
        }


        System.out.println("+++++++++++++++++++++稀疏数组++++++++++++++++++++++++++++");
        for (int[] row : sparseArray) {
            for (int data : row) {

                System.out.print(data+" ");
            }
            System.out.println();
        }


        //3、稀疏数组转为二维数组
        int chessArrayNew[][] = new int[(sparseArray[0][0])][(sparseArray[0][1])];
       for(int i = 1; i<sparseArray.length; i++){
           chessArrayNew[(sparseArray[i][0])][(sparseArray[i][1])] = sparseArray[i][2];
       }

        System.out.println("+++++++++++++++++++++chessArrayNew++++++++++++++++++++++++++++");
        for (int[] row : chessArrayNew) {
            for (int data : row) {

                System.out.print(data+" ");
            }
            System.out.println();
        }


    }


}
