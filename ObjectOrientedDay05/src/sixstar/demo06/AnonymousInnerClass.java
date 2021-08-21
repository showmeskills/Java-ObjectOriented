package sixstar.demo06;

public class AnonymousInnerClass {
    public static void main(String ...args){
        MyInterface myInterface = new MyInterface() {
            @Override
            public void methodOne(){
                System.out.println("实现类覆盖重写方法!!,111-B");
            }
            @Override
            public void methodTwo(){
                System.out.println("实现类覆盖重写方法!!,2222-B");
            }
        };
        myInterface.methodTwo();
        myInterface.methodOne();
        new MyInterface(){
            @Override
            public void methodOne(){
                System.out.println("实现类覆盖重写方法!!,111-B");
            }
            @Override
            public void methodTwo(){
                System.out.println("实现类覆盖重写方法!!,2222-B");
            }
        }.methodOne();

        new MyInterface(){
            @Override
            public void methodOne(){
                System.out.println("实现类覆盖重写方法!!,111-B");
            }
            @Override
            public void methodTwo(){
                System.out.println("实现类覆盖重写方法!!,2222-B");
            }
        }.methodTwo();



        new Son(){
            @Override
            public void method(){
                System.out.println("This is son to override father's method");
            }
        }.method();

    }

}
