import java.util.LinkedList;

public class MyLinkedList {



    public static void main(String[] args){

//        Banker john = new Banker("John" , 2000);
//
//       Banker jane = john;
//
//       jane.setcBalance(1000);
//
//        System.out.println(john.getcBalance());


        LinkedList<String> linkedList  = new LinkedList<>();

        linkedList.add("c");
        linkedList.add("Java");
        linkedList.add("C#");
        linkedList.add("python");

       for (int i =0 ; i<linkedList.size() ; i++){


           System.out.println(linkedList.get(i));
       }

        System.out.println("---------------------------------------------------------------");

       linkedList.add(2 , "Swift");


        for (int i =0 ; i<linkedList.size() ; i++){


            System.out.println(linkedList.get(i));
        }

    }

}
