import java.util.Scanner;

public class OddandEvenList {

    public static void main(String args[]){

        int number;

//      Input taken by the user
        System.out.println("Enter the size of list");
        Scanner in = new Scanner(System.in);

        number = in.nextInt();

        // For loop to create even list
        System.out.println("Even list of the number");
        for (int i=1 ; i<=number ; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

//       For loop to create odd list of the numbers
        System.out.println("Odd list of the numbers");
        for (int i =1 ; i<number ; i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
