import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {

    public static void main(String args[])
    {

        ArrayList<String> heroes = new ArrayList<String>();

        heroes.add("Hulk");
        heroes.add("Iron Man");
        heroes.add("Superman");
        heroes.add(0 , "Batman");

        System.out.println(heroes.get(0));


    }
}
