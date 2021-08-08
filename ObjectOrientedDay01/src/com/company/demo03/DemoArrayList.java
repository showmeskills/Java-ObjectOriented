package com.company.demo03;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main (String[] args){
        Person[] personArr = new Person[3];
        String [] name = new String[]{"Terry","Erick","Terrance"};
        int [] age = new int[]{20,10,15};

        for(int i = 0; i < personArr.length;i++){
            personArr[i] = new Person(name[i],age[i]);
        }
        System.out.println(personArr[0]);



        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Terry",20));
        persons.add(new Person("Erick",10));
        persons.add(new Person("Terrance",15));
        for(Person person : persons){
            System.out.println(person);
        }
        System.out.println(DemoArrayList.class.getSuperclass());
    }
}
