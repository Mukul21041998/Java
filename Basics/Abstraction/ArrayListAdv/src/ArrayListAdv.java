import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAdv {

    public static void main(String args[]){

        ArrayList<Integer> myArrayList  = new ArrayList<>();

        Scanner in  = new Scanner(System.in);





//        Set the value

        for (int i =0 ; i<20 ; i++)
        {

            myArrayList.add(Integer.valueOf(i)); // Autoboxing

        }

//        Get the value

        for (int i = 0 ; i<20 ; i++)
        {
            System.out.println("value is :" + myArrayList.get(i).intValue()); // Unboxing
        }

    }


}
