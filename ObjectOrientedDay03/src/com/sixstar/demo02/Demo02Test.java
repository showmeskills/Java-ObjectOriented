package com.sixstar.demo02;

public class Demo02Test {
    public static void main(String...args){
        Son son = new Son();
        Father father = new Father();
        son.methodF();
        son.methodS();
        System.out.println(son.num);
        son.sameMethod();
        father.sameMethod();
        System.out.println("===================");
        Father f = new Son();
        f.sameMethod();
        System.out.println(f.num);
    }
}
