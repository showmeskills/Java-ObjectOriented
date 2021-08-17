package com.sixstar.demo06;

import java.util.ArrayList;

public class GroupLeader extends User{
    public GroupLeader(){
        super();
    }
    public GroupLeader(String name,int balance){
        super(name,balance);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redPackList = new ArrayList<>();

        int currentBalance = super.getBalance();
        if(totalMoney > currentBalance){
            System.out.println("your current balance is insufficient");
            return redPackList;
        }
        super.setBalance(currentBalance - totalMoney);

        //avg money
        int avg = totalMoney/ count;
        //last money
        int mod = totalMoney%count;
        //why count - 1, because it left a mod;
        for(int i = 0; i < count - 1;i++){
            redPackList.add(avg);
        }
        int lastOne = avg+mod;
        redPackList.add(lastOne);

        return redPackList;
    }

}
