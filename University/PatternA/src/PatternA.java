import java.util.Scanner;

public class PatternA {

    public static void main(String args[])
    {

        int size;
        System.out.println("Enter the size of pattern");

        Scanner in = new Scanner(System.in);
        size = in.nextInt();

        for (int i=1;i<=size ;i++)
        {
            for (int j=1 ;j<=i ;j++)
            {
                System.out.print("*");
            }

            System.out.println("");


        }
    }
}
