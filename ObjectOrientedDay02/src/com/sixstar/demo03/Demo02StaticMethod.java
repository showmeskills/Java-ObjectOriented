package com.sixstar.demo03;

public class Demo02StaticMethod {
    private static int a;
    private static String b;
    static{
       a = 0;
       b = "this a string";
       System.out.println("a====>"+a);
       System.out.println("b=====>"+b);
       System.out.println("this is a static block more priority than other blocks");
    }
    public Demo02StaticMethod(){
        System.out.println("this is second one to run");
    }
}
