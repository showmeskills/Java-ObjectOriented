package com.sixstar.demo04;
import java.util.Arrays;
//java.util.Arrays 提供了大量的静态方法
public class Demo01Arrays {
    public static void main(String ...args){
        int[] intArr = new int[]{10,20,30};
        //int [] to String ==> print out is default format
        String str = Arrays.toString(intArr);
        // sort method ascend
        int [] arr = {4,6,8,2,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        char [] arr1 = {'c','A','a','x','D','B'};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"Abc","CCC","BDDD","EDS"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
