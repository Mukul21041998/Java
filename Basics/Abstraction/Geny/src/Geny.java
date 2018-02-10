import java.util.ArrayList;

public class Geny {

    public static void main(String args[]){


        ArrayList<Integer> arrayList  = new ArrayList<>();

        arrayList.add(21);
        arrayList.add(22);
        arrayList.add(24);

        for (Object i : arrayList){

            System.out.println(i);
        }
    }
}
