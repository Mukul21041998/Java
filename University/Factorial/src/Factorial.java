import java.util.Scanner;

public class Factorial {

    public static void main(String args[])
    {

        int number , factorial=1,temp;
        System.out.println("Enter the number");

        Scanner in = new Scanner(System.in);

        number = in.nextInt();

        temp = number;

        if(temp!=0)
        {
            while(factorial != (temp))
            {
                number = number *factorial;
                factorial++;
            }

            System.out.println("Factorial of the number" + " " + temp + " " + "is" + " " +number);
        }

        else
        {
            System.out.println("Enter the number greater than 0");
        }




    }
}
