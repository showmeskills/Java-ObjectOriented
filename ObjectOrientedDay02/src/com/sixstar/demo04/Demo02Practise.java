package com.sixstar.demo04;

import java.util.Arrays;
import java.util.Collections;


public class Demo02Practise {
    public static void main (String ...args){
        String str = "sdfisdifaAsdnaFS123kdxD";
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        for(int i = 0; i < strArr.length;i++){
            System.out.print(strArr[strArr.length -1 - i]);
        }
        System.out.println();

        Integer[] arr = {11,5,6,7,8,10};
        Arrays.sort(arr, Collections.reverseOrder());
        for(Integer x : arr){
            System.out.println(x+" ");
        }
        System.out.println();
    }
}
