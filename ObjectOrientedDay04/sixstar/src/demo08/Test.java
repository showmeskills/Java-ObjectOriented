package demo08;

public class Test {
    public static void main(String ...args){
//        Animal animal = new Dog();
//        if(animal instanceof  Dog){
//            Dog dog = (Dog)animal;
//            dog.guard();
//        }
//        if(animal instanceof Cat){
//            Cat cat = (Cat) animal;
//            cat.catchMouse();
//        }
        checkIns(new Dog());
    }
    public static void checkIns(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.guard();
        }else if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
