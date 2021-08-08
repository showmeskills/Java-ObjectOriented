package com.sixstar.demo02;
import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String ...args){
        enterString(new Scanner(System.in));
    }
    public static void enterString(Scanner scanner){
        System.out.println("please enter your favourite string");
        String str = scanner.next();
        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;
        int other = 0;
        char[] strChar = str.toCharArray();
        for(char element:strChar){
            if('A'<= element && element <= 'Z' ){
                upperCase ++;
            }else if('a' <= element && element <= 'z'){
                lowerCase ++;
            }else if('0' <= element && element <= '9'){
                number ++;
            }else{
                other ++;
            }
        }
        System.out.println("appear:{upperCase:"+upperCase+",lowerCase:"+lowerCase+",number:"+number+",other:"+other+"}");
    }
}
