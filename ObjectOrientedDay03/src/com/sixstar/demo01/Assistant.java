package com.sixstar.demo01;

public class Assistant extends Employee{
    protected String name = "Assistant";
    protected int age = 25;
    @Override
    protected void method(String who){
        System.out.println(who+" is using Assistant method");
    }
}
