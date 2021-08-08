package com.sixstar.demo03;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0;
    public Student(){};
    //static attribute members can not be at constructor;
    public Student( String name, int age){
        this.id = ++idCounter;
        this.name = name;
        this.age = age;
    }

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

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }
    @Override
    public String toString(){
        return "Student:{"
                +"id:"+this.id
                +",name:"+this.name
                +",age:"+this.age
                +",room:"+room
                +"}";
    }
}
