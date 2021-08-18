package demo02;

public class MyDefaultImpl implements MyIDefault{
    @Override
    public void method2(){
        System.out.println("Override abstract method");
    }
    @Override
    public void method1(){
        System.out.println("Override default method in impl class");
    }
}
