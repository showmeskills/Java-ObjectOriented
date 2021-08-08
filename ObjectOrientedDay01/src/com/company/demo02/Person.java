package com.company.demo02;

public class Person {
    String name;
    public Person(){};
    public Person(String name){
        this.name = name;
    }
    public void showName (){
        System.out.println(this.name);
    }
}
