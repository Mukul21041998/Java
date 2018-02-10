import java.util.ArrayList;
import java.util.Scanner;

public class Result {

    private static Scanner in = new Scanner(System.in);


    public  static void main(String args[]){

            int marks[] = new int[10];
            String subject[] = new String[10];

         StudentResult ram = new StudentResult("Ram");

         for(int i =0 ; i<5 ; i++)
         {

             System.out.println("Enter the subject");
             subject[i] = in.nextLine();

             System.out.println("Enter the subject marks");
             marks[i] = in.nextInt();
             in.nextLine();



         }

         for (int i = 0 ;i<5 ;i++){

             String subjectResult = subject[i];
             int marksResult = marks[i];

            ram.resultDeclaration(subjectResult , marksResult);
         }



    }
}
