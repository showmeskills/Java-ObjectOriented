package demo09;

public class Test {
    public static void main(String ...args){
        Laptop laptop = new Laptop();
        laptop.switchOn();
        USB usbMouse = new Mouse();
        USB usbKeyboard = new Keyboard();
        laptop.useDevice(usbMouse);
        laptop.useDevice(usbKeyboard);
        laptop.switchOff();

    }
}
