package com.sixstar.demo02;

public class Demo03Substring {
    public static void main(String[] args){
        String str1 = "HelloWorld";
        //substring(begin:index,end:length)
        String result = str1.substring(0,1);
        System.out.println(result);

        String str2 = "hello world";
        String result1 = str2.substring(5, 8);
        System.out.println(result1);


    }
}
