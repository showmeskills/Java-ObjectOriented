package com.company.demo02;
import java.util.Scanner;
public class Demo01Anonymous {
    public static void main(String[] args){

        methodParam(new Scanner(System.in));
        System.out.println("enter your number");
        Scanner scanner = returnMethod();
        int num = scanner.nextInt();
        System.out.println("your number is "+ num);
    }
    public static Scanner returnMethod(){
        return new Scanner(System.in);
    }
    public static void methodParam(Scanner scanner){
        int num = scanner.nextInt();
        System.out.println("输入的是"+num);
    }
}
