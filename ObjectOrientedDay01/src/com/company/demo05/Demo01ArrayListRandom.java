package com.company.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main (String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        int times = 0;
        boolean isFlag = true;
        while(isFlag){
            times++;
            int randomInt = random.nextInt(33)+1;
            if(times == 6){
                isFlag = false;
            }else{
                list.add(randomInt);
            }
        }
        for(Integer element:list){
            System.out.println(element);
        }
    }
}
