package com.example.demo.leetcode;

import javax.lang.model.element.VariableElement;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * 一个由{}[]()组成的字符串，判断是否是成对出现的
 */
public class StackTest {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("{", "[", "]", "}",")");


        Boolean b = check(strings);
        System.out.println(b);

    }



    private static Boolean check(List<String> objects) {

        Map<String,String> map = new HashMap<>();
        map.put("}","{");
        map.put("]","[");
        map.put(")","(");
        Stack<String> stack = new Stack<>();
        for (String object : objects) {
            //结尾括号不入栈，只判断是否和栈顶成对
            if (map.containsKey(object)) {
                //栈为空或者是栈顶不成对则返回false
                if (stack.isEmpty() || stack.pop() != map.get(object)) {
                    return false;
                }
            } else {
                //开头括号加入栈
                stack.push(object);
            }
        }
        //判断栈是否为空
        return stack.isEmpty();
    }
}
