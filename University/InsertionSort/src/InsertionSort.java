import java.util.Scanner;

public class InsertionSort {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array list");
        int size  = in.nextInt();

        int array[] = new int[size];

        for(int i = 0 ; i<size ; i++){

            System.out.println("Enter the values of the list");

            array[i] = in.nextInt();

        }

        System.out.println("Your array list is;");
        for (int i =0 ;i<size ; i++){

            System.out.print(array[i] + "\t");
        }

        for (int i = 0 ; i<size-1  ; i++){

            if(array[i] > array[i+1]){

              for(int j = (i+1) ; j>0  ; j--){

                  if(array[j] < array[j-1]){

                      int temp = array[j-1];
                      array[j-1]  = array[j];
                      array[j] = temp;
                  }
              }
            }


        }

        System.out.println("");

        System.out.println("Sorted array list is:");

        for(int i =0 ; i<size  ; i++){

            System.out.print(array[i] + "\t");
        }

    }



}
