import java.util.Scanner;

public class LeapYear {

    public static void main(String args[]){


        int year;
        System.out.println("Enter the year");

        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        if((year % 400 == 0)  || (year % 4 == 0  &&  year % 100 != 0) )
        {
            System.out.println("This year is leap year");
        }

        else
        {
            System.out.println("This year is not the leap year");
        }
    }
}
