import java.util.Scanner;

public class AddTwoNumsUsers {

    public static void main(String args[])
    {
//          declare variable
            int firstNumber;
            int secondNumber;
            int result;
//      take input from user
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        firstNumber=in.nextInt();
        System.out.println("Enter the seconnd number");
        secondNumber=in.nextInt();
//      add two numbers given by user
        result=firstNumber+secondNumber;

//        print the result
        System.out.println("The sum of two number is:" + result);

        // TODO: Edit the program into string

    }
}
