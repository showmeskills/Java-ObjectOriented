package com.sixstar.demo02;

public class Son extends Father{
    int numS = 30;
    int num = 5;

    public void methodS(){
        System.out.println(this.num+": this is num from Son");
    }

    public void sameMethod(){
        System.out.println("the same method name son");
    }
}
