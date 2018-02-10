public class BankApp {

    String name;
    int age;
    double tax;
    double amount;


//    construcor

    public  BankApp ()
    {

        System.out.println("Constructor called");
    }

//    Name of user

    public void userName(String name){

        this.name  = name;
    }

//    ask for age

    public void accAge(int age){

        this.age  = age;
    }

//      tax details

    public void accTax(double tax){

        this.tax  = tax;
    }

//    amount

    public void depositAmount(double amount){

        this.amount = amount;
    }

//    user information

    public void userInfo(){

        System.out.println("name of user is :" + this.name);

        System.out.println(this.name + " " + "account balance is : " + this.amount);
    }
}
