package com.example.demo.arithmetic;


/**
 * 使用数组模拟队列
 */
public class ArrayQueueDemo {


    public static void main(String[] args) {
        String a = "222222222222222222222222222222";
        Double aDouble = Double.valueOf(a);
        String s = aDouble.toString();
        System.out.println(s);
        System.out.println(String.valueOf(aDouble));
    }


}


/**
 * 模拟队列类
 */
class ArrayQueue{

    //队列最大长度
    private int maxSize;
    //队列前
    private int front;
    //队列后
    private int rear;
    //模拟队列
    private int[] arr;

    //初始化队列
    public ArrayQueue(int maxSize){
        maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;//初始值
        rear = -1;//初始值
    }

    //判断队列是否满
    public boolean isFull(){
        return rear == maxSize-1;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }

    //添加数据
    public void add(int i){
        //判断是否满
        if(isFull()){
            return;
        }
        rear++;
        arr[rear] = i;
    }

    //取数据
    public int getQueue(){
        return 0;
    }




}

