package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制 。
 * 实现 LRUCache 类：
 *
 * LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
 * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * void put(int key, int value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 */
public class LRUCache {

    //链表长度
    int capacity;
    //哈希表，查询
    Map<Integer,DLinkedNode> map = new HashMap<>();
    //头节点
    DLinkedNode head;
    //尾节点
    DLinkedNode tail;


    /**
     * 初始长度为capacity的双向链表
     * @param capacity 链表长度
     */
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    /**
     * 通过key获取value，如果key不存在，返回-1;
     * 如果key存在,移动节点到链表头部
     * @param key
     * @return
     */
    public int get(int key) {
        //不存在返回-1
        if(map.get(key) == null){
            return -1;
        }
        //存在，移动到头部
        DLinkedNode dLinkedNode = map.get(key);
        toHead(dLinkedNode);
        return dLinkedNode.value;
    }

    /**
     * 移动节点到头部
     * @param dLinkedNode
     */
    private void toHead(DLinkedNode dLinkedNode) {
        //删除该节点
        removeNode(dLinkedNode);
        //添加到头部
        addHead(dLinkedNode);
    }

    /***
     * 新增节点,
     * 如果key存在则修改，该节点移动到链表头部
     * @param key
     * @param value
     */
    public void put(int key, int value) {
        DLinkedNode dLinkedNode = new DLinkedNode(key, value);
        if(map.get(key) == null){
        //不存在
            //判断链表长度，是否满
            if(map.size() >= capacity){
                //长度不足，删除尾节点
                DLinkedNode node = removeTail();
                map.remove(node.key);
            }

        }
        //存在,修改值，移动到头部
        addHead(dLinkedNode);
        map.put(key,dLinkedNode);
    }

    /**
     * 新增节点到头部
     * @param dLinkedNode
     */
    private void addHead(DLinkedNode dLinkedNode) {

        dLinkedNode.prev = head;
        dLinkedNode.next = head.next;
        head.next.prev = dLinkedNode;
        head.next = dLinkedNode;

    }

    /**
     * 删除尾节点
     */
    private DLinkedNode removeTail() {
        DLinkedNode prev = tail.prev;
        removeNode(prev);
        return prev;

    }

    /**
     * 删除节点
     * @param node
     */
    private void removeNode(DLinkedNode node){
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }



    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        int i = lruCache.get(1);
        System.out.println("初始化=="+i);
        lruCache.put(1,1);
        i = lruCache.get(1);
        System.out.println("新增1后===="+i);
        lruCache.put(2,2);
        i = lruCache.get(2);
        System.out.println("新增2后==="+i);
        lruCache.put(3,3);
        i = lruCache.get(1);
        System.out.println("新增3后获取1==="+i);
        i = lruCache.get(3);
        System.out.println("新增3后获取3===="+i);
        lruCache.put(2,6);
        i = lruCache.get(3);
        System.out.println("新增2后获取3===="+i);



    }


    /**
     * 双向链表
     */
    class DLinkedNode{
        int key;
        int value;
        //前节点
        private DLinkedNode prev;
        //后节点
        private DLinkedNode next;

        public DLinkedNode(){}
        public DLinkedNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }


}
