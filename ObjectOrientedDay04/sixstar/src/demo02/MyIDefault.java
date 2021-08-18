package demo02;

public interface MyIDefault {
    public default void method(){
        System.out.println("interface default method one");
    }
    public default void method1(){
        System.out.println("interface default method two");
    }
    public abstract void method2();
}
