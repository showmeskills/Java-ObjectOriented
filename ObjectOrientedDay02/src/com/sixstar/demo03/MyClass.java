package com.sixstar.demo03;

public class MyClass {
    int num;//成员变量
    static int numStatic;//静态成员变量
    public void method(){//成员方法
        //成员方法可以访问 静态或非静态 属性和方法
        System.out.println(this.num);
        System.out.println(numStatic);
        methodStatic();
    }
    public static void methodStatic(){//静态成员方法
        //静态方法 无法访问非静态属性和方法;只能访问静态属性和方法
        //System.out.println(this.num);
        System.out.println(numStatic);
    }
}
