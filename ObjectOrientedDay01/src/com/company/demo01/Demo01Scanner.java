package com.company.demo01;

import java.util.Scanner;


public class Demo01Scanner {

    public static void main(String[] args) {
	// write your code here
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter a number");
     int num = scanner.nextInt();
     System.out.println("your number is" + num);

     System.out.println("Please enter a string");
     String str = scanner.next();
     System.out.println("your string is" + str);
    }
}
