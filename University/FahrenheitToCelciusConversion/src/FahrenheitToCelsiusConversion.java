import java.util.Scanner;

public class FahrenheitToCelsiusConversion {

    public static void main(String args[])
    {

        int temp;

        System.out.println("Enter the temperature in fahrenheit");
        Scanner in = new Scanner(System.in);

        temp = in.nextInt();

        temp = ((temp-32)*5)/9;

        System.out.println("Temperature in celcius is :" + " " + temp);


    }
}
