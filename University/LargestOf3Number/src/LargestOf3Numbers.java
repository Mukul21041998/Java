import java.util.Scanner;

public class LargestOf3Numbers {

    public static void main(String args[]){

        int number1,number2,number3;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        number1 = in.nextInt();
        System.out.println("Enter the second number");
        number2 = in.nextInt();
        System.out.println("Enter the third number");
        number3 = in.nextInt();

        if(number1 > number2 && number1 > number3)
        {
            System.out.println(number1 + " " + "is greater number");
        }

        else if(number2 > number1 && number2 > number3)
        {
            System.out.println(number2 + " " + "is greater number");
        }

        else if (number3 > number1 && number3 > number2)
        {
            System.out.println(number3 + " " + "is greater number");
        }

//        TODO: Check if all number are equal

        else
        {
            if(number1==number2 && number2==number3 && number3 == number1)
            {
                System.out.println(number1 + " " + "is greater number");
            }

            else if(number1==number2)
            {
                System.out.println(number1 + " " + "is greater number");
            }

            else if(number1 == number3)
            {
                System.out.println(number1 + " " + "is greater number");
            }

            else if(number2 == number3)
            {
                System.out.println(number2 + " " + "is greater number");
            }


        }
    }
}
