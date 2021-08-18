package demo07;

public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("The dog is eating bone");
    }
    public void guard(){
        System.out.println("The dog is guarding a house");
    }
}
