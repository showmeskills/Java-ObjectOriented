package com.sixstar.demo02;

public class Father {
    int numF = 20;
    int num = 50;
    public void methodF(){
        System.out.println(this.num+": this is num from Father");
    }
    public void sameMethod(){
        System.out.println("the same method name father");
    }
}
