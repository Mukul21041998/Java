import java.util.Scanner;

public class OddAndEven {

    public static void main(String args[])
    {

        int number;

        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);

        number = in.nextInt();

        if (number % 2==0)
        {
            System.out.println("Number is even");
        }

        else {

            System.out.println("Number is odd");
        }
    }
}
