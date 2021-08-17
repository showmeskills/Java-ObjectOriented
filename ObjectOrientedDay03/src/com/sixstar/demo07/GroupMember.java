package com.sixstar.demo07;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends User{
    public GroupMember(){
        super();
    };
    public GroupMember(String name, int balance){
        super(name, balance);
    }

    public void receivedMoney(ArrayList<Integer> redPackList){
        int index = new Random().nextInt(redPackList.size());

        int receivedMoney = redPackList.remove(index);

        super.setBalance(receivedMoney + super.getBalance());
    }
}
