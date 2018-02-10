import java.util.Scanner;

public class StarAndNumberPattern {

    public static void main(String args[]) {

        // TODO:Printing star

        int size;
        System.out.println("Enter the size of pattern");

        Scanner in = new Scanner(System.in);
        size = in.nextInt();

        for (int i = 1; i <= size; i++)
        {
            for (int j = i; j <= size; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }

            System.out.println("");

//            TODO:Printing Numbers


        for(int i=size;i>=1;i--)
        {
            for (int j=1 ; j<=i ; j++)
            {
                System.out.print(j);
            }

            System.out.println("");
        }





        }
    }


