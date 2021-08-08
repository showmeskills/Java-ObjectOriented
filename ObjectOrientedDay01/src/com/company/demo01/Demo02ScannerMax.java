package com.company.demo01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Demo02ScannerMax {
    public static void main (String[] args){

        int [] arrNum = new int[5];

        for(int i = 0; i < arrNum.length; i++){
            arrNum[i] = i;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int element:arrNum){
            list.add(element);
        }
        System.out.println(list.toString());


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter one number");
        int a = scanner.nextInt();
        System.out.println("please enter two number");
        int b = scanner.nextInt();
        System.out.println("please enter three number");
        int c = scanner.nextInt();

        int temp = a > b? a:b;
        int max = temp > c? temp : c;
        System.out.println("your max number is "+ max);
    }
}
