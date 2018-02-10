package com.company;

import java.util.ArrayList;

public class TodoFunction {

    private ArrayList<String> todoList = new ArrayList<>();

//    Add the item to the list

    public void addItem(String item) {

        todoList.add(item);
    }
//    Print the list

    public void printTodoList() {
        System.out.println("Todo list consists of: " + todoList.size() + "items");

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println("Item at position " + (i + 1) + " is " + todoList.get(i) + "in the list");
        }
    }
//    Remove the item from the list

        public void removeItem ( int index)
        {
            todoList.remove(index);
        }
//    Update the list

        public void updateTodoList ( int index, String item)
        {
            todoList.set(index, item);
        }

//    Search feature for user

        public String findItem (String searchItem)
        {
            int index = todoList.indexOf(searchItem);
            if (index == -1) {
                return null;
            } else {

                return todoList.get(index);
            }

        }

    }

