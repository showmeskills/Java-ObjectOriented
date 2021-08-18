package demo05;


public class Demo01Multi {
    public static void main (String ...args){
        Father father = new Son();
        father.methodF();
        father.method();// 向上转型 后优先调用 等号右边的,也就是子类，没有再去父类中寻找

    }
}
