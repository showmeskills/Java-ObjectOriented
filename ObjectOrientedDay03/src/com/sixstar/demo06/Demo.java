package com.sixstar.demo06;

import java.util.ArrayList;

public class Demo {
    public static void main (String ...args){
        GroupLeader leader = new GroupLeader("GroupLeader",1000);
        GroupMember memberA = new GroupMember("memberA",0);
        GroupMember memberB = new GroupMember("memberB",0);
        GroupMember memberC = new GroupMember("memberC",0);

        leader.showBalance();
        memberA.showBalance();
        memberB.showBalance();
        memberC.showBalance();

        ArrayList<Integer> redPackList = leader.send(33,3);
        memberA.receiveMoney(redPackList);
        memberB.receiveMoney(redPackList);
        memberC.receiveMoney(redPackList);


        leader.showBalance();
        memberA.showBalance();
        memberB.showBalance();
        memberC.showBalance();
    }
}
