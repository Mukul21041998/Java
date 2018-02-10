import java.util.Scanner;

public class MaxyFinder {


    public static <T extends Comparable<T>> T maxy (T x , T y , T z){


      T  maxy = x;

      if(y.compareTo(maxy)>0){

          maxy = y;
      }

      if(z.compareTo(maxy)>0){

          maxy = z;
      }


      return maxy;


    }

   public static void main(String args[]){


       Scanner in = new Scanner(System.in);

       System.out.println("Enter the value for x , y and z");

       String x = in.nextLine();
       String  y = in.nextLine();
       String z = in.nextLine();

       System.out.println("Maximum value is:" + maxy(x ,y ,z));








   }
}
