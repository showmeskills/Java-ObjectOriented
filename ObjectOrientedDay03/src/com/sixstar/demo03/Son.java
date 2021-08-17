package com.sixstar.demo03;

public class Son extends Father{
    public Son(){
        super();
    }
    public Son(String ddd){
        super(ddd);
    }

    @Override
    public void method(String str){
        super.method("???");
        System.out.println(str);
    }
}
