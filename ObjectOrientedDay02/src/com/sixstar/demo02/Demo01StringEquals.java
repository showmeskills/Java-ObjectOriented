package com.sixstar.demo02;

public class Demo01StringEquals {
    public static void main(String[] args){
        //equals
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3 = new String(charArray);

        //equalsIgnoreCase
        String str4 = "java";
        String str5 = "Java";
        System.out.println(str4.equals(str5));//false
        System.out.println(str4.equalsIgnoreCase(str5));//true

        String str6 = null;
        System.out.println("abc".equals(str6));
    }
}
