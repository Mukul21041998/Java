package com.company;


 class   Banker{

    private String  name;

     public Banker(String name) {
         this.name = name;
     }

     public String greet(){

         return ("Default greet\n");
     }
 }

 class BOA extends Banker {

     public BOA() {
         super("BOA");
     }

     @Override
     public String greet() {
         return "Welcome to the Bank of America";
     }
 }

 class BOI extends Banker {

     public BOI() {
         super("BOI");
     }

     @Override
     public String greet() {
         return "Welcome to SBI Bank";
     }
 }

 class SBI extends Banker {

     public SBI() {
         super("SBI");
     }

     @Override
     public String greet() {
         return "Welcome to SBI Bank";
     }
 }


public class Main {

    public static void main(String[] args) {

        for (int i =1 ; i<5 ; i++){

            Banker banker = GernerateObject();
            System.out.println("Bank greet is  :" + banker.greet());
        }

    }

    public static Banker GernerateObject(){

        int random = (int)Math.random();
        System.out.println(random);
        random = (random*3)+1;
        System.out.println(random);

        switch (random){

            case 1:
                return new BOA();

            case 2:
                return new BOI();

            case 3:
                return new SBI();

                default:
                    return null;


        }
    }


}

