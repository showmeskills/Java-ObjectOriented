package demo03;

public interface IDemo03 {
    public static void demo03SMethod(){
        System.out.println("this is IDemo03 static method");
    }
    public default void demo03DMethod(){
        this.demo03PMethod();
        demo03SMethod();
    }
    private void demo03PMethod(){
        System.out.println("this is Private method");
    }
}
