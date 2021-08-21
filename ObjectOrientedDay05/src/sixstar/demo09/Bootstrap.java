package sixstar.demo09;

import sixstar.red.OpenMode;


public class Bootstrap {

    public static void main(String[] args) {

        MyRed red = new MyRed("微信红包");
        //设置群主名称
        red.setOwnerName("王思聪");
        //普通红包
//        OpenMode openMode = new NormalMode();
//        red.setOpenWay(openMode);

        //手气红包
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
