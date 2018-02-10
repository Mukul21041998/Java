import java.util.Scanner;

public class GradeGreeting {

    public static void main(String args[])
    {

        int star;

        System.out.println("Enter the star rating to the student from 1 to 5");
        Scanner in = new Scanner(System.in);
        star = in.nextInt();

       switch (star)
       {
           case 5:
           {
               System.out.println("Excellent Work");
               break;
           }

           case 4:
           {
               System.out.println("very good");
               break;
           }

           case 3:
           {
               System.out.println("good");
               break;
           }

           case 2:
           {
               System.out.println("ok");
               break;
           }

           case 1:
           {
               System.out.println("Required more practice");
               break;
           }

           default:
           {
               System.out.println("Enter the correct number");
           }
       }
    }
}
