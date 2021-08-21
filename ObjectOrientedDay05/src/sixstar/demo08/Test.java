package sixstar.demo08;

public class Test {
    public static void main(String ...args){
      Hero hero = new Hero();
      hero.setAge(15);
      hero.setName("Terry");
      Weapon weapon = new Weapon("Axe");
      hero.setWeapon(weapon);
      hero.setSkill(new ISkill(){
          @Override
          public String magic(){
              return "fire ball";
          }
          @Override
          public String physical(){
              return "normal attack";
          }
      });
      hero.attack();
    }
}
