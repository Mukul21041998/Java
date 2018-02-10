import java.awt.desktop.ScreenSleepListener;
import java.util.Scanner;

public class Methods {

//    public - Visible to everyone
//    private - Visible only to class
//    protected - Visible to the package and all subclass

//    modifier return-type method-name(Parameter List){
//         body
// }

    public static void main(String args[]){

//        sayHello();
//        minNumber();
        System.out.println("Enter the first number");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextByte();

        System.out.println("Enter the second number");
        Scanner n2 = new Scanner(System.in);
        int num2 = n1.nextByte();

        int result = minimumNumber(num1 , num2);

        System.out.println("The minimum number is :" + result);

    }


//    public static void sayHello(){
//
//        System.out.println("Hello Java");
//    }


//    public static void minNumber(){
//
//        int number1;
//        int number2;
//        System.out.println("Enter the first number");
//        Scanner in1 = new Scanner(System.in);
//        number1 = in1.nextInt();
//
//        System.out.println("Enter the second number");
//        Scanner in2 = new Scanner(System.in);
//        number2 = in2.nextInt();
//
//        if(number1 < number2)
//        {
//            System.out.println("The minimum number is :" + number1);
//        }
//
//        else
//        {
//            System.out.println("The minimum number is :" + number2);
//        }
//
//
//
//    }

    public static int minimumNumber(int num1 , int num2)
    {
        int min;
        if(num1 < num2)
        {
            min = num1;
        }

        else {
             min = num2;
        }

        return min;
    }
}

