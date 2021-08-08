package com.sixstar.demo02;

public class Demo05StringSplit {
    public static void main(String[] args){
        String str = "aaa,bbb,ccc";
        String[] arr = str.split(",");
        String arrStr = "Arr:{";
        for(int i = 0; i < arr.length;i++){
            if( i == arr.length-1){
                arrStr+=arr[i];
            }else{
                arrStr+=arr[i]+"@";
            }
        }
        arrStr+= "}";
        System.out.println(arrStr);
    }
}
