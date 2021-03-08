package com.rcs.classwork.Day10;


import java.util.Locale;
import java.util.Scanner;

public class FindName {
    public static void main(String[]args){
        String[] names = { "Kristaps", "Kristīne", "Līga",
                            "Matīss", "Martiņš", "Jānis",
                            "Ilze", "Sanita", "Sandijs" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Meklēt: ");
        String searchBy = sc.next();
        sc.close();
        /*for (int i = 0; i < names.length; i++){
            if (names[i].toLowerCase().startsWith(searchBy.toLowerCase())){
                System.out.println(names[i]);
            }
        }*/
        for (String name : names){
            if (name.toLowerCase().startsWith(searchBy.toLowerCase())) {
                System.out.println(name);
            }
        }
    }
}
