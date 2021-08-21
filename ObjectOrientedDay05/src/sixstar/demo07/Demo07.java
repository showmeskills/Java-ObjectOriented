package sixstar.demo07;

public class Demo07 {
    public static void  main(String...args){

        Hero hero = new Hero();
        hero.setName("Terry");
        hero.setAge(15);
        Weapon weapon = new Weapon("axes");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
