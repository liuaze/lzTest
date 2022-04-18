package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeNode {



    public ListNode addNode(ListNode listNode1,ListNode listNode2){

        ListNode result = new ListNode(-1);
        ListNode pre = result;
        while (listNode1 != null && listNode2 != null){

            if(listNode1.val <= listNode2.val){
                pre.next = listNode1;
                listNode1 = listNode1.next;
            }else{
                pre.next = listNode2;
                listNode2 = listNode2.next;
            }

            pre = pre.next;
        }

        pre.next = listNode1 == null ? listNode2:listNode1 ;

        return result.next;

    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }


    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }

    }



    //-----------------------------------------------------------------

    /**
     *存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
     * 返回同样按升序排列的结果链表。
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode result = head;
        while(result.next != null){
           if(result.val == result.next.val){
               result.next = result.next.next;
           }else{
               result = result.next;
           }
        }
        return head;

    }







    public static void main(String[] args) {
        // todo 参数总的node节点不可用同一对象，最后会死循环
        ListNode listNode = new ListNode(5);
        ListNode listNode1 = new ListNode(1,listNode);
        ListNode listNode2 = new ListNode(1,listNode1);

        ListNode listNode6 = new ListNode(5);
        ListNode listNode3 = new ListNode(3,listNode6);
        ListNode listNode4 = new ListNode(1,listNode3);

        MergeNode mergeNode = new MergeNode();

        /*ListNode listNode5 = mergeNode.mergeTwoLists(listNode2, listNode4);
        while (listNode5 != null){
            int val = listNode5.val;
            System.out.println(val);
            listNode5 = listNode5.next;
        }*/
        ListNode listNode5 = mergeNode.deleteDuplicates(listNode2);
        System.out.println("====");


    }




}


/**
 * 模拟升序链表
 */
class ListNode {

    int val;
    ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
