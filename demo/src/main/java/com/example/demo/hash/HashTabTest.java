package com.example.demo.hash;


import java.util.Scanner;

/**
 * 有一个公司,当有新的员工来报道时,要求将该员工的信息加入(d,性别,年龄,名字,住址,当输入该员工的id时
 * 要求查找到该员工的所有信息
 * 要求
 * )不使用数据库,速度越快越好=>哈希表(散列)
 * 2)添加时,保证按照id从低到高插入[课后思考:如果id不是从低到高插入,但要求各条链表仍是从低到
 * 高,怎么解决?
 * 3)使用链表来实现哈希表,该链表不带表头[即:链表的第一个结点就存放雇员信
 * 4)思路分析并画出示意图
 */
public class HashTabTest {

    public static void main(String[] args) {

        //创建哈希表
        HashTab hashTab = new HashTab(7);

        //简单菜单
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true){


            System.out.println("add : 添加员工");
            System.out.println("list : 显示员工");
            System.out.println("find : 查找员工");
            System.out.println("exit : 退出系统");

            key = scanner.next();

            switch (key){
                case "add":
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入name");
                    String name = scanner.next();

                    //创建员工
                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("输入id");
                    id = scanner.nextInt();
                    hashTab.findEmpById(id);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    break;

            }

        }


    }

}


/**
 * 创建hashTab管理多链表
 */
class HashTab{

    private EmpLinkedList[] empLinkedListArray;

    //链条数
    private  int size;

    //构造器
    public HashTab(int size){
        this.size = size;
        empLinkedListArray = new EmpLinkedList[size];
        //todo ??? 是否分别初始每个链表
        for (int i= 0; i < size; i++){
            empLinkedListArray[i] = new EmpLinkedList();
        }

    }

    /**
     * 新增员工
     * @param emp
     */
    public void add(Emp emp){

        //根据员工id，确定新增在那条链表上
        int empLinkedListArrayNo = hashFun(emp.id);
        //新增信息到链表
        empLinkedListArray[empLinkedListArrayNo].add(emp);

    }

    /**
     * 遍历所有链表
     */
    public void list(){
        for(int i = 0; i < size ;i++){

            empLinkedListArray[i].list(i);
        }
    }


    /**
     * 根据id查找员工
     * @param id
     * @return
     */
    public void findEmpById(int id){

        //根据散列确定哪条链表
        int empLinkedListArrayNo = hashFun(id);

        Emp empById = empLinkedListArray[empLinkedListArrayNo].findEmpById(id);

        if(empById == null){
            System.out.println("没有找到");
        }else{
            System.out.println("在第"+(empLinkedListArrayNo+1)+"条链表中，找到员工id"+id);
        }

    }




    /**
     * 根据id简单取模，分散id
     * @param id
     * @return
     */
    public int hashFun(int id){
        return id % size;
    }



}





















/**
 * 员工类
 */
class Emp{

    public int id;
    public String name;
    public Emp next;

    public Emp(int id,String name){
        this.id = id;
        this.name = name;
    }

}


/**
 *
 * 模拟员工信息链表
 */
class EmpLinkedList{

    //链表头指针，默认为null
    public Emp head;

    /**
     * 链表新增,新增到链表最后
     * @param emp
     */
    public void add(Emp emp){
        //如果链表头元素为空，则新增到头
        if(head == null){
            head = emp;
            return;
        }

        //如果头不为空，则新增到最后

        Emp empNew = head;


        while (true){
            //说明链表到了最后  todo??
            if(empNew.next == null ){
                break;
            }
            empNew = empNew.next;//后移
        }

        //退出时将元素加到最后
        empNew.next = emp;

    }


    /**
     * 遍历链表信息
     * todo ?? no
     * @param no
     */

    public void list(int no){
        if(head == null){
            System.out.print("第"+(no+1)+"个链表为空");
            return;
        }

        System.out.print("第"+(no+1)+"个链表的信息为：");
        Emp emp = head;

        while (true){
            System.out.print("id = "+ emp.id + ",name = " + emp.name);

            //说明到最后,停止
            if(emp.next == null) {
                break;
            }

            emp = emp.next;//后移

        }

        System.out.println();

    }


    /**
     * 根据id查找员工，找到返回emp，没有返回null
     * @param id
     * @return
     */
    public Emp findEmpById(int id){

        //判断链表是否为空
        if(head == null){
            return null;
        }

        //辅助指针
        Emp emp = head;

        while (true){
            if(emp.id == id){
                //匹配成功，停止，返回
                break;
            }

            if(emp.next == null){
                //找到结尾都没匹配成功，返回null
                emp = null;
                break;
            }

            emp = emp.next;

        }
        return emp;

    }

}




