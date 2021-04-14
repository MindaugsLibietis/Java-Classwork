package com.rcs.classwork.Day22;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Author[] autori = {new Author("Kristaps", "Krumins"),
                            new Author("Davis","Pikse", Gender.MALE, "Latvija", LocalDate.of(1998, 10, 15)),
                            new Author("Janis", "Berzins", Gender.MALE, "Latvija")});*/
//        autori[0] = new Author("Davis", "Pikse");
//        autori[1] = new Author("Janis", "Berzins");

        /*Scanner sc = new Scanner(System.in);
        String gramatasNosaukums = sc.nextLine();
        Author[] authors = new Author[3];
        for (int i = 1; i <= 3; i++) {
            System.out.println("name: ");
            String name = sc.nextLine();
            System.out.println("surname: ");
            String surname = sc.nextLine();
            System.out.println("gender: ");
            String gender = sc.nextLine();
            Gender genderValue = Gender.valueOf(gender.toUpperCase());
            authors[i] = new Author(name, surname, genderValue, "");
        }
        sc.close();

        Book gramata1 = new Book(gramatasNosaukums, authors);*/

        Book gramata1 = new Book("Mana gramata", new Author[] {new Author("Kristaps", "Krumins"),
                new Author("Davis","Pikse", Gender.MALE, "Latvija", LocalDate.of(1998, 10, 15)),
                new Author("Janis", "Berzins", Gender.MALE, "Latvija")});
        System.out.println(gramata1);
    }
}
