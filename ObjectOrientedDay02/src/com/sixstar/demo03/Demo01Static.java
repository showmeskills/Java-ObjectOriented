package com.sixstar.demo03;


import java.util.ArrayList;

/*
* 如果一个成员变量使用static关键字,那么这个变量不在属于对象自己,属于所在的类
* 多个对象共享同一个静态属性
* */
public class Demo01Static {
    public static void main(String ...args){
        //多个对象共享一个静态属性
//        Student.room = "Room 101";
//        Student.setIdCounter(100);
//        Student studentOne = new Student("Terry",20);
//        Student studentTwo = new Student("Terrance",25);
//
//        System.out.println(studentOne.toString());
//        System.out.println(studentTwo.toString());
        Student.room = "Room 101";
        Student.setIdCounter(1000);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Erick",20));
        list.add(new Student("Terry007",15));
        for(int i = 0; i <list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
