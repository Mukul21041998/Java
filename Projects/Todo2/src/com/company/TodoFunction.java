package com.company;

import java.util.ArrayList;

public class TodoFunction {

    private ArrayList<String> todoList = new ArrayList<>();

    //    Add item to the list
    public void addItem(String item)
    {
        todoList.add(item);
    }
    //    Update the item in the list
    public void updateList(int index , String item)
    {
        todoList.set(index , item);
    }

//    Remove the item from the list
    public void removeItem(int index)
    {
        todoList.remove(index);
    }
//    Search the item from the list
    public String searchItem(String itemName)
    {
        int index  = todoList.indexOf(itemName);
        if(index == -1)
        {
            return null;
        }

        else
        {
            return todoList.get(index);
        }
    }
//    Print the list items
    public void printListItem()
    {
        System.out.println("List of items in the list is:");
        for (int i=0 ; i<todoList.size();i++){
            String itemName = todoList.get(i);
            System.out.println(itemName);
        }
    }


}


