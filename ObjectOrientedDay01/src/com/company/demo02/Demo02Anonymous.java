package com.company.demo02;


public class Demo02Anonymous {
    public static void main(String[] arg){
//        匿名对象，需要确定 当前类只会被使用一次
        new Person("Terry").showName();
    }
}
