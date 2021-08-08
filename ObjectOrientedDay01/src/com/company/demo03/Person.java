package com.company.demo03;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private  int age;
    public Person(){};
    public Person(String name,int age) {
       this.name = name;
       this.age = age;
    }

    @Override
    public String toString(){
        return "Person:{"
                +"name:"+ this.name
                +"age:"+ this.age+
                "}";
    }
}
