package com.sixstar.demo01;

public class Teacher extends Employee {
    protected String name = "Teacher";
    protected int age = 26;
    @Override
    protected void method(String who){
        System.out.println(who+" is using Teacher method");
    }
}
