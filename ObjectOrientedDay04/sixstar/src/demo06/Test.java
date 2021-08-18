package demo06;
/*
* 访问成员变量的两种方法
* 1.直接通过对象名称访问成员变量:看等号左边是谁，优先用谁，没有向上寻找
* 2.间接通过成员方法访问成员变量:看方法属于谁,优先用谁，没有向上寻找
* 3.向上转型时候，子类是否有重写父类的方法，有就优先使用子类，没有就是
* 调用父类的方法
* 4.在多态的代码中，成员方法的范围规则是:
* 看new的是谁，就优先用谁,没有向上寻找
* 口诀:编译看左边，运行看右边
* */
public class Test {
    public static void main(String ...args){
        Father father = new Son();
        father.methodF();//方法属于父类
        System.out.println(father.num);//看等号左边是父类 返回父类的num
        father.showNum();//方法属于子类;因为子类重写
        father.method();//方法属于子类；因为子类重写
    }
}
