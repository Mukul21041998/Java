public class GenericClass {

    public static void main(String args[]){

        Holder<Integer> myValue = new Holder<>();

        myValue.setMyVar(3);
        System.out.println(myValue.getMyVar());
    }
}
