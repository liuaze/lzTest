package com.example.demo.test;

import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSON;

import java.util.*;
import java.util.stream.Collectors;

/**
 * uuid排序按首次出现a的下角标排序
 */
public class SortUuidTest {



    private static List<TestVo> initList = new ArrayList<>();


    static {
        String path = "classpath:data.json";
        List<String> strings = FileUtil.readUtf8Lines(path);
        initList = strings.stream().map(s -> JSON.parseObject(s, TestVo.class)).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(JSON.toJSONString(get(5)));

    }


    /**
     * 找到比age小的，并按uuid 中第一个a的下角标排序，下角标一样的按age排序
     * @param age
     * @return
     */
    public static List<TestVo> get(int age){
        List<TestVo> list = new ArrayList<>();
        //按age过滤
        list = initList.stream()
                .filter(s->s.getAge() < age)
                .sorted(Comparator.comparing(s->s.getAge()))
                .sorted(Comparator.comparing(s->s.uid.indexOf("a")))
                .collect(Collectors.toList());
        return list;
    }






    static class TestVo{
        private int age;
        private String uid;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }
























}
