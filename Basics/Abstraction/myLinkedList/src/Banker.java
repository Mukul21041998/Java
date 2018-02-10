public class Banker {


    private String cName;
    private int cBalance;

    public Banker(String cName, int cBalance) {
        this.cName = cName;
        this.cBalance = cBalance;
    }


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcBalance() {
        return cBalance;
    }

    public void setcBalance(int cBalance) {
        this.cBalance = cBalance;
    }
}
