package demo09;

public class Keyboard implements USB{
    @Override
    public void switchOn(){
        System.out.println("keyboard switch on");
    }
    @Override
    public void switchOff(){
        System.out.println("keyboard switch off");
    }
    public void enterFunction(){
        System.out.println("keyboard enter function");
    }
}
