package com.sixstar.demo01;

public class Demo01Test {

    public static void main(String ...args){
        Employee employee = new Teacher();
        employee.method("employee");
        System.out.println(employee.name);

        Teacher teacher = (Teacher)employee;
        teacher.method("teacher");
        System.out.println(teacher.name);



    }
}
