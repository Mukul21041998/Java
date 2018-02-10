import java.util.Scanner;

public class SelectionSort {


    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array list");
        int size  = in.nextInt();

        int array[] = new int[size];

        int index  =0 ;

        for(int i = 0 ; i<size ; i++){

            System.out.println("Enter the values of the list");

            array[i] = in.nextInt();

        }

        System.out.println("Your array list is;");
        for (int i =0 ;i<size ; i++){

            System.out.print(array[i] + "\t");
        }

        for(int i = 0; i<size  ; i++){

            index =i;

            for(int j=i+1 ; j<size  ; j++){

                if(array[j] < array[index]){

                   index = j;


                }
            }

            int temp = array[i];
            array[i]  = array[index];
            array[index] = temp;

        }

        System.out.println("");

        System.out.print("New sorted array list is\n");

        for (int i=0 ; i<size ; i++){


            System.out.print(array[i] + "\t");
        }


    }


}

