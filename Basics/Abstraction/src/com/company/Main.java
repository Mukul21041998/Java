package com.company;

public class Main {

    public static void main(String[] args) {

//        Banker firstEmplaoy = new Banker("Ram" , 10000 , 300);
        BOI employ = new BOI("Ram" , 1000 , 300);

        System.out.println(employ.getBalance());
    }
}
