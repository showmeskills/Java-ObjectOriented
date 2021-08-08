package com.sixstar.demo02;

public class Demo02StringGet {
    public static void main(String[] args){
        int length = "abcde".length();
        System.out.println(length);

        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(" ").concat(str2);
        String str4 = str1 +" "+ str2;
        System.out.println(str3);
        System.out.println(str4);


        char singleChar = "hello world".charAt(1);
        System.out.println(singleChar);

        String str5 = "hello world";
        int result = str5.indexOf("c");//返回字符串中出现的第一个索引，没有返回-1
        System.out.println(result);
    }
}
