package com.example.demo;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.advanced.Demo;
import com.example.demo.advanced.Sum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String s = "202105";
        String substring = s.substring(4);
        System.out.println(s.substring(4));
    }

    private static final String track_formatter = "jr|keycount|jddx_{0}|#_{1}_{2}_{3}_{4}_{5}_#";

    @Test
    public void test() {


        //  List<String> s  = [1832845491541,1832845491546,1833030611909,1833030611419,1833030611901,1833269739648,1833269739647,1833355937401];
       /* String q = "1832845491541";
        String w = "1832845491546";
        List<String> s = new ArrayList<>();
        s.add(q);
        s.add(w);
        for (String s1 : s) {
            System.out.println(s1);
        }*/

        /*Integer num = 51/50;
        for(int i = 0 ;i<=num;i++){
            System.out.println(num);
        }*/

        /*Demo demo = new Demo();

        demo.setName("(");

        System.out.println(demo.getName());

        StringEscapeUtils.unescapeHtml
*/
        /*for (int i = 1;i<=10;i++){
            System.out.println(i);
        }*/
        String dlyxWdwzC = "province_HB01000000--QSHYDLFL_QSHYDLFL01--FDLX_FDLX0120--t_ElectricClassification_ZJ01000000";
        Map<String,String> map = new HashMap<>();

            String[] split = dlyxWdwzC.split("--");
        for (String s : split) {
            String[] s1 = s.split("_");

            map.put(s1[0],s1[1]);
        }


        System.out.println(map.toString());

    }

    @Test
    public void sumTest() {
        String hah = Sum.reverse("123");
        System.out.println(hah);
    }

    @Test
    public void streamTest() {
        Demo demo = new Demo();
        demo.setName("name1");
        demo.setCode("000");
        Demo demo1 = new Demo();
        demo1.setName("name1");
        demo1.setCode("0001");
        Demo demo2 = new Demo();
        demo2.setName("name2");
        demo2.setCode("0001");
        List<Demo> list = new ArrayList<>();
        list.add(demo);
        list.add(demo1);
        list.add(demo2);
        Map<String, List<Demo>> collect = list.stream().collect(Collectors.groupingBy(Demo::getName));
        System.out.println(collect.toString());
    }

    @Test
    public void booleanTest() {
        String a = "b";
        String b = "b";
        int i = 4;

        Boolean aBoolean;

        Demo demo = new Demo();
        System.out.println(demo.getB());
        System.out.println(demo.isA());


        System.out.println(i++);
        System.out.println("+=======================" + demo.getB());
        System.out.println(a == b);
        System.out.println("a == b is " + (a == b));

    }

    @Test
    public void doWhileTest() {


       /* int i = 0;
        do {
            System.out.println("======" + i);
            i++;
            if (i > 10) {
                return;
            }
        }
        while (false);*/
        Integer num = Math.toIntExact(406L / 200);
        System.out.println(num);
        if(406L%200==0){
            num--;
        }
        System.out.println(num);

    }


    @Test
    public void wySort() {
        String name = "中长期合约电量导入2021-06-17.xlsx";
        String s = name.split(".")[0];

    }

    @Test
    public void javaStringTest(){
        /*String s1 = new StringBuilder("go")
                .append("od").toString();
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja")
                .append("va").toString();
        System.out.println(s2.intern() == s2);*/

        String s = "[\"b21aa9b4a6ed4cfb85d7344dee67a5df.png?attname=微信图片_20211202181453.png\",\"99313b5b9cd547e6855aa595e7f476f3.jpg?attname=页面设计.jpg\"]";

        List<String> strings = JSON.parseArray(s, String.class);

        System.out.println(strings.get(0));
        //System.out.println(o.toString());


    }

    @Test
    public void bigDecimalTest(){
        BigDecimal bigDecimal = new BigDecimal("01");
        double v = bigDecimal.doubleValue();
    }

    @Test
    public void timeTest() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
        SimpleDateFormat formatOld = new SimpleDateFormat("yyyy-MM-dd");

        String per = "2021-01-01";
        try {
            Calendar cal = Calendar.getInstance();
            cal.clear();
            cal.setTime(formatOld.parse(per));
            int i = cal.get(Calendar.MONTH);
            cal.set(Calendar.YEAR,cal.get(Calendar.YEAR));
            cal.set(Calendar.MONTH,cal.getActualMaximum(Calendar.MONTH));
            cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DAY_OF_MONTH));




            //cal.set(Calendar.DAY_OF_YEAR, 1);
            System.out.println (formatOld.format(cal.getTime()));
           /* cal.set(Calendar.DAY_OF_YEAR, -1);
            System.out.println (formatOld.format(cal.getTime()));*/

            System.out.println(per.substring(5));
            System.out.println(per.substring(5,7));
            System.out.println(per.substring(0,4));

            //calendar.set(Calendar.YEAR,calendar.get(Calendar.YEAR));

            //calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            //System.out.println(formatOld.format(calendar.getTime()));

            //format.parse(per);
            //System.out.println(format.parse(per).toString());
            //System.out.println(formatOld.parse(per).toString());
            /*Date date = formatOld.parse(per);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.MONTH,-1);
            Date time = calendar.getTime();
            System.out.println(formatOld.format(time));*/
            //测试计算周===============================
           /* calendar.setFirstDayOfWeek(Calendar.FRIDAY);
            calendar.setMinimalDaysInFirstWeek(7);
            calendar.setTime(date);
            int i = calendar.get(Calendar.WEEK_OF_YEAR);
            int month = calendar.get(Calendar.MONTH)+1;
            int year = calendar.get(Calendar.YEAR);
            if(month == 1 && i > 50){
                //本周为前一年最后一周
                year = year - 1;
            }
            System.out.println(String.valueOf(i).length());
            System.out.println("12".length());
            System.out.println(year);
            System.out.println(year + "-" + i +"(周)");*/
            //===================================================




        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
