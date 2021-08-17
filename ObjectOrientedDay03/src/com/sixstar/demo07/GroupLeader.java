package com.sixstar.demo07;

import com.sixstar.demo06.GroupMember;

import java.util.ArrayList;

public class GroupLeader extends User{
    public GroupLeader(){
        super();
    };
    public GroupLeader(String name,int balance){
        super(name,balance);
    }

    public ArrayList<Integer> sendMoney(int totalMoney,int count){
        ArrayList<Integer> redPackList = new ArrayList<>();
        int currentBalance = super.getBalance();
        if(totalMoney > currentBalance){
            System.out.println("your current balance is insufficient");
        }

        int newBalance = currentBalance - totalMoney;
        super.setBalance(newBalance);

        int avg = totalMoney / count;
        int mod = totalMoney % count;

        for(int i = 0; i < count - 1; i ++){
            redPackList.add(avg);
        }
        redPackList.add(avg+mod);

        return redPackList;
    }
}
