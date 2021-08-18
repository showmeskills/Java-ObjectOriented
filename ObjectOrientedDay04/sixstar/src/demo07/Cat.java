package demo07;

public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("the cat is eating fish");
    }
    public void catchMouse(){
        System.out.println("the cat is catching mouse");
    }
}
