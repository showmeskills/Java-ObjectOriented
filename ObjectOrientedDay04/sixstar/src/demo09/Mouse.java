package demo09;

public class Mouse implements USB{
    @Override
    public void switchOn(){
        System.out.println("switch on mouse");
    }
    @Override
    public void switchOff(){
        System.out.println("switch off mouse");
    }
    public void clickFunction(){
        System.out.println("mouse click function");
    }
}
