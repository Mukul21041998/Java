import java.util.Scanner;

public class Array {

    public static void main(String args[])
    {
        int a[] = new int[10];

        for (int i=0;i<5;i++)
        {
            System.out.println("Enter the value in the list");
            Scanner in = new Scanner(System.in);
            a[i] = in.nextByte();
        }

        System.out.println("The lis is :");
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
