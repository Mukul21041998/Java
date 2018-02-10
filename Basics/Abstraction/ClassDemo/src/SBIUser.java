public class SBIUser extends BankApp {

    public SBIUser(){

        super();



    }

    @Override
    public void userInfo() {
        super.userInfo();
        System.out.println(this.name + " " + "tax is:" + this.tax);
    }
}
