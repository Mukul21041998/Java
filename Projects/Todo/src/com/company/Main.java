package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static TodoFunction myTodoList = new TodoFunction();

    public static void main(String[] args) {

        int command = 0;
        boolean exit = false;

        printCommand();

        while (!exit) {

            System.out.println("Enter the choice");
            command  = scanner.nextInt();
            scanner.nextLine();


            switch (command)
            {
                case 0:
                {
                    printCommand();
                    break;
                }

                case 1:
                {
                    myTodoList.printTodoList();
                    break;
                }

                case 2:
                {
                    addItem();
                    break;
                }

                case 3:
                {
                    updateList();
                    break;
                }

                case 4:
                {
                    removeItem();
                    break;
                }

                case 5:
                {
                   searchItem();
                    break;
                }

                case 6:
                {
                    exit = true;
                    break;
                }

                default:{
                    System.out.println("Please enter the correct value");
                }
            }
        }
    }


        public static void printCommand()
        {

            System.out.println("Enter your choice" +
                    "\n press 0 : To print instruction " +
                    "\n press 1 : To print the list " +
                    "\n press 2 :  To add item in the todo list" +
                    "\n press 3 : To update the list" +
                    "\n press 4 : To remove the item from the toso list" +
                    "\n press 5 : To search the item in the todo list" +
                    "\n press 6 : To exit from the list");

        }

        public static void addItem()
        {
            System.out.println("Enter the item to add into the list");
            String item = scanner.nextLine();
            scanner.nextLine();
            myTodoList.addItem(item);

        }

        public static void updateList()
        {
            System.out.println("Enter the possition  for the item to add into the list");
            int index  = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the item");
            String item = scanner.nextLine();
            myTodoList.updateTodoList(index , item);
        }

        public static void removeItem()
        {
            System.out.println("Enter the item number of the list to remove");
           int index = scanner.nextInt();
           scanner.nextLine();
           myTodoList.removeItem(index);

        }

        public static void searchItem()
        {
            System.out.println("Enter the item name to be search");
            String itemName = scanner.nextLine();
            scanner.nextLine();
           if(myTodoList.findItem(itemName) == null)
            {
                System.out.println("Item not found");
            }

            else
            {
                System.out.println(itemName +  "found in the list");;
            }
        }
    }



