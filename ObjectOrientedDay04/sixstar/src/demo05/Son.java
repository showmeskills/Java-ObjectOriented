package demo05;

public class Son extends Father{
    public Son(){
        super();
    }
    @Override
    public void method(){
        System.out.println("Son override father's method");
    }
    public void methodS(){
        System.out.println("Belong to son method");
    }
}
