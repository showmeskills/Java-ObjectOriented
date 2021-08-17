package com.sixstar.demo07;

import com.sixstar.demo06.GroupMember;

import java.util.ArrayList;

public class Test {
    public static void main(String ... args){
        GroupLeader gl = new GroupLeader("leader",100);
        GroupMember ma = new GroupMember("ma",5);
        GroupMember mb = new GroupMember("mb",15);
        GroupMember mc = new GroupMember("mc",25);

        gl.showBalance();
        ma.showBalance();
        mb.showBalance();
        mc.showBalance();

        ArrayList<Integer> redPackList = gl.sendMoney(33,3);
        ma.receiveMoney(redPackList);
        mb.receiveMoney(redPackList);
        mc.receiveMoney(redPackList);

        gl.showBalance();
        ma.showBalance();
        mb.showBalance();
        mc.showBalance();
    }
}
