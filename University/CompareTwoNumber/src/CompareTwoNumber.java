import java.util.Scanner;

public class CompareTwoNumber {

    public static void main(String args[]){

        int number1;
        int number2;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        number1 = in.nextInt();

        System.out.println("Enter the second number");
        number2 = in.nextInt();

        if (number1 > number2)
        {
            System.out.println(number1 + "is greater than" + number2);
        }

        else if(number1 == number2)
        {
            System.out.println(number1 + " and" + number2 + "are equal");
        }

        else if(number1 < number2)
        {
            System.out.println(number1 +  "is less than" +  number2);
        }

        else
        {
            System.out.println("Enter the correct number");
        }

    }
}
