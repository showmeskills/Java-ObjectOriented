package com.sixstar.demo01;



//在java.lang.* 下的包不需要导包
class Demo01String {
    public static void main (String[] args){
        //使用空参的字符串
        String str1 = new String("123");
        System.out.println("第一个字符串:"+str1);
        String str2 = "abc";
        String str3 = "abc";
        System.out.println(str2==str3);

        char[] charArray = {'A','B','C'};
        String charStr1 = charArray.toString();
        String charStr2 = new String(charArray);
        System.out.println(charStr1);//打印的是地址值
        System.out.println(charStr2);
        //byte to String
        byte[] byteArray = {97,98,99,100};
        String str5 = new String(byteArray);
        System.out.println(str5);

        String strA = new String ("ABC");
        String strB = new String ("ABC");
        System.out.println(strA == strB);//false
        System.out.println(strA.equals(strB));//true

        String strC = "ABC";
        String strD = new String ("ABC");
        System.out.println(strC == strD); //false
        System.out.println(strC.equals(strD));//true
        System.out.println();


        char[] arrChar = {'A','B','C'};
        String strE = "ABC";
        String strF = new String("ABC");
        String charStr = new String (arrChar);
        System.out.println(strE == charStr);//false reason: strE stores in the stack, charStr stors in the heap
        System.out.println(strF == charStr);// false reason: there are different address value;
        System.out.println(strE.equals(strE)+" "+ strF.equals(charStr));//true true
    }
}
