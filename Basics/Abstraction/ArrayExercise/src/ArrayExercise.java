import java.util.Scanner;

public class ArrayExercise {

    public static void main(String args[])
    {
        int i,j,temp;
        int sum=0;
        int size =5;
        int variable[] = new int[size];

//        TODO:Print  all the elements store in array
//
        for ( i=0;i<variable.length ; i++)
        {
            System.out.println("Enter the elements of array list");
            Scanner in = new Scanner(System.in);
            variable[i] = in.nextInt();

        }
//
//        System.out.println("Array list is:");
//
//        for (int i=0;i<variable.length;i++)
//        {
//            System.out.println(variable[i]);
//        }



//        TODO:Find the largest number store in array

//        for ( i=0;i<variable.length;i++)
//        {
//            for ( j =i+1 ; j<variable.length ; j++)
//            {
//                if(variable[i]>variable[j])
//                {
//                    temp = variable[i];
//                    variable[i]=variable[j];
//                    variable[j]=temp;
//                }
//
//            }
//
//
//        }

//        System.out.println("The largest number of the list is:" + variable[i-1]);




//        TODO:Sum of all the elements store in array

        for (i=0;i<variable.length;i++)
        {
            sum = sum+variable[i];
        }

        System.out.println("the sum of the elements of the lsit is:" + sum);

    }
}
