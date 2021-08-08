package com.sixstar.demo02;

public class Demo04StringToCharArray {
    public static void main(String[] args){
        String str = "Hello";
        char[] chars = str.toCharArray();
        for(char element:chars){
            System.out.print(element);
        }
        System.out.println("==============");
        byte[] bytes = str.getBytes();
        for(byte element: bytes){
            System.out.print(element);
        }
        System.out.println("==============");
        String str1 = "what the fuck";
        String str2 = str1.replace("uc","xx");
        System.out.println(str2);



    }
}
