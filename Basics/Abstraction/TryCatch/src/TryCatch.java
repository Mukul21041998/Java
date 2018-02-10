public class TryCatch {


    public static void main(String args[]){


        int array[] = {1,2,3};
        try {

            System.out.println(array[3]);

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println(e);


        }

        System.out.println("Program not crashed");
    }
}
