package demo09;

public class Laptop implements USB{
    @Override
    public void switchOn(){
        System.out.println("laptop switch on");
    }
    @Override
    public void switchOff(){
        System.out.println("laptop switch off");
    }

    public void useDevice(USB usb){
        usb.switchOn();
        if(usb instanceof  Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.clickFunction();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.enterFunction();
        }
        usb.switchOff();
    }
}
