package com.rcs.classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> toDoItems = new ArrayList<>();
        System.out.println("ievadiet darāmo lietu nosaukumus: ");
        while (true) {
            String item = sc.nextLine();
            if (item.equalsIgnoreCase("exit")){
                break;
            }
            toDoItems.add(item);
        }
        /*String item = "";
        while(!item.equalsIgnoreCase("exit")){
            item = sc.nextLine();
            if (!item.equalsIgnoreCase("exit")){
                toDoItems.add(item);
            }
        }*/
        sc.close();
        System.out.printf("Jūsu sarakstā ir %d lietas:\n", toDoItems.size());
        for (int i = 0; i < toDoItems.size(); i++){
            System.out.printf("To-Do Item %d: %s\n", i+1, toDoItems.get(i));
        }
    }
}
