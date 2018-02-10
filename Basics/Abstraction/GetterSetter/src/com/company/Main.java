package com.company;

public class Main {

    public static void main(String[] args) {


        MyClass ram = new MyClass();

        ram.setAge(34);
        System.out.println(ram.getAge());


        

    }



}


class MyClass {

    private  String name;
    private  int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age){

        this.age = age;

    }
}
