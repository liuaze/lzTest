package com.example.demo.test;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class ClassTest {

    /*class Inner {
    }
    public static void foo() {
        new Inner();
    }
    public void bar() {
        new Inner();
    }
    public static void main(String[] args) {

        new Inner();
    }*/

    final private void a(){

    }
    private String name;

    public static void main(String[] args) {
       /* LocalDateTime now = LocalDateTime.now();
        int day = now.getDayOfMonth();
        int monthValue = now.getMonthValue();
        int hour = now.getHour();
        int value = now.getDayOfWeek().getValue();
        System.out.println(value);*/

        String per = "20210522";
        SimpleDateFormat format= new SimpleDateFormat("yyyy");
        SimpleDateFormat formatOld= new SimpleDateFormat("yyyyMMdd");

        /*try {
            Date date = formatOld.parse(per);
            Calendar calendar = Calendar.getInstance();
            calendar.setFirstDayOfWeek(Calendar.MONDAY);
            calendar.setTime(date);
            int i = calendar.get(Calendar.WEEK_OF_YEAR);
           String result = format.format(date) + i +"(周)";
            System.out.println(result);
        } catch (ParseException e) {

        }*/
        String result = null;
        if(per != null && per.length() >= 7){
            String year = per.substring(0, 4);
            String qtr = per.substring(4, 7);
            if("003".equals(qtr)){
                result =  year + "-1(季)";
            }else if("006".equals(qtr)){
                result =  year + "-2(季)";
            }else if("009".equals(qtr)){
                result =  year + "-3(季)";
            }else if("012".equals(qtr)){
                result =  year + "-4(季)";
            }
            System.out.println(result);
        }
    }

}

class Child extends ClassTest{



}



