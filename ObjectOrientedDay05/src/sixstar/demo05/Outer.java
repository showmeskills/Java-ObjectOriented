package sixstar.demo05;

public class Outer {
    public int num = 30;
    public void innerClassMethod(){
        class Inner{
            public int num = 10;
            public void method(){
                int num = 20;
                this.num = 50;
                System.out.println(num);
                System.out.println(this.num);
                System.out.println(Outer.this.num);
            }
        }
        Inner inner = new Inner();
        inner.method();
    }
}
