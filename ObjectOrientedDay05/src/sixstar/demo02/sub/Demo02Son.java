package sixstar.demo02.sub;

import sixstar.demo02.Demo02Father;

public class Demo02Son extends Demo02Father {
    public void method(){
        String b = super.b;
        String a = super.a;
    }
}

class Demo02Son2{
    public void method(){
        String a = new Demo02Father().a;
    }
}
