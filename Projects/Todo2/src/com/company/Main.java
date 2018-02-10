package com.company;

import java.util.Scanner;

public class Main {

    private static TodoFunction todoFunction = new TodoFunction();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;

        printInstruction();


        while(!exit)
        {
            System.out.println("Enter the choice");

            int  choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 0:
                    printInstruction();
                    break;

                case 1:
                    todoFunction.printListItem();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    updateList();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchItem();
                    break;

                case 6:
                    exit = true;
                    break;

                    default:
                        System.out.println("Please enter correctly");
                        break;
            }
        }

    }

    public static void printInstruction()
    {
        System.out.println("Press 0 : To print the instruction" +
                "\nPress 1 : To print the all item of the list" +
                "\nPress 2 : To add the item into the list" +
                "\nPress 3 : To update the list" +
                "\nPress 4 : To remove the item from the list" +
                "\nPress 5 : To search the item in the list" +
                "\nPress 6 : To exit");
    }

    public static void addItem(){

        System.out.println("Enter the name of item to add into the list");

        String itemName = scanner.nextLine();

        todoFunction.addItem(itemName);

    }

    public static void updateList(){

        System.out.println("Enter the possition of new item you want to add into the list");
        int index = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the new item name");
        String newItem = scanner.nextLine();

        todoFunction.updateList(index , newItem);
        System.out.println("Updation is completed");

    }

    public static void removeItem(){

        System.out.println("Enter the index of item to remove from the list");
        int index = scanner.nextInt();

        todoFunction.removeItem(index);

    }

    public static void searchItem()
    {

        System.out.println("Enter the item name to be searched");
        String itemName =  scanner.nextLine();
        if(todoFunction.searchItem(itemName) == null)
        {
            System.out.println("Item not found in the list");
        }

        else
        {
            System.out.println(itemName + "found in the list at possition");
        }

    }
}
