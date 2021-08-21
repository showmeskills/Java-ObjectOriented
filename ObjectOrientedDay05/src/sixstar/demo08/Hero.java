package sixstar.demo08;

public class Hero {
    private String name;
    private int age;
    private ISkill skill;
    private Weapon weapon;

    public Hero() {};

    public Hero(String name, int age, ISkill skill, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.weapon = weapon;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ISkill getSkill() {
        return skill;
    }

    public void setSkill(ISkill skill) {
        this.skill = skill;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("age:" + this.getAge()+
                ", name:" + this.getName()+
                        ", use:" + this.getWeapon().getGetCode()+
                        "and use skills:"+ this.getSkill().magic()+
                        "and "+this.getSkill().physical()
        );
    }
}
