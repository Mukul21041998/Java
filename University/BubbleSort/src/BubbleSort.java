import java.util.Scanner;

public class BubbleSort {


    private static void scanNums(){

        int array[] = new int [5];

        int i;



        Scanner in = new Scanner(System.in);



        for ( i =0 ; i<array.length ; i++){

            System.out.println("Enter the number");

            array[i]  = in.nextInt();


        }

        bubbleSort(array , i );

    }


    private static void bubbleSort( int array[] , int i) {


        for ( i =0 ; i<array.length ;i++){

            for (int j =i+1 ; j<array.length ;j++){

                if(array[i] > array[j]){

                    swap(0 , i , j , array);
                }


            }
        }

        printNums(i , array);


    }


    private static void swap(int temp , int i , int j , int array[] ){


        temp = array[i];

        array[i] = array[j];

        array[j]  = temp;



    }

    private static void printNums(int i , int array[]){

        for(i=0 ; i<array.length ; i++){

            System.out.println(array[i]);

        }



    }

    public static void main(String args[]){

        scanNums();

        
    }
}
