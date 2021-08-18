package demo07;

import demo08.Animal;
import demo08.Cat;
import demo08.Dog;

public class Test {
    public static void main(String...args){
        Animal animalCat = new Cat();
        Animal animalDog = new Dog();
//      animalCat.eat();
//      animalDog.eat();

        Cat cat = (Cat)animalCat;
        cat.catchMouse();
        cat.eat();

        Dog dog = (Dog)animalDog;
        dog.guard();
        dog.eat();
    }
}
