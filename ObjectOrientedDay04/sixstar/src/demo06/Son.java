package demo06;

public class Son extends Father{
    int num = 20;
    int age = 16;
    @Override
    public void showNum(){
        System.out.println(this.num);
    }
    @Override
    public void method(){
        System.out.println("Son override father's method");
    }
    public void methodS(){
        System.out.println("Belong to son method");
    }
}
