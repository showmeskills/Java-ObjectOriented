package com.sixstar.demo02;

public class Demo06StringPractise {
    public static void main(String[] args){
        int[] intArr = {1,2,3,4,5,6};
        String str = intArrayToString(intArr);
        System.out.println(str);
    }
    public static String intArrayToString(int[] intArr){
        String str = "intArr:{";
        for(int i = 0; i < intArr.length;i++){
            if(i == intArr.length-1){
                str+= "word"+intArr[i];
            }else{
                str+="word"+intArr[i]+"#";
            }
        }
        str+="}";
        return str;
    }

}
