package com.sixstar.demo06;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends User{
    public GroupMember(){
        super();
    }
    public GroupMember(String name,int money){
        super(name,money);
    }

    public void receiveMoney(ArrayList<Integer> redPackList){
        int index = new Random().nextInt(redPackList.size());

        int redPack = redPackList.remove(index);

        int money = super.getBalance();
        super.setBalance(money+redPack);

    }
}
