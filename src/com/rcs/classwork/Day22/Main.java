package com.rcs.classwork.Day22;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Random;
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

        Book gramata1 = new Book("Mana gramata", new Author[] {
                new Author("Kristaps", "Krumins"),
                new Author("Davis","Pikse", Gender.MALE, "Latvija", LocalDate.of(1998, 10, 15)),
                new Author("Janis", "Berzins", Gender.MALE, "Latvija")
        });

        StoreItem bookItem1 = new BookItem(2.49, 10, gramata1);
//        System.out.println(bookItem1);

        StoreItem bookItem2 = new BookItem(10.99, 23,
                new Book("Some Book", new Author[] {
                new Author("Janis", "Berzins")
        }));
//        System.out.println(bookItem2);

        BookStore store = new BookStore(new Address("Latvia", "Riga", "Brovobas", 20), "29313515");
        store.addStoreItem(bookItem1);
        store.addStoreItem(bookItem2);
        store.addStoreItem(new NotebookItem(0.99, 80, 60, "20x10 cm", NotebookType.LINES));
        store.addStoreItem(new BookItem(50.99, 124, new Book("Darga gramata", new Author[] {
                new Author("Autora", "Vardins")
        })));
        store.addStoreItem(new NotebookItem(1.20, 192, 100, "20x19 cm", NotebookType.RULED));
        System.out.println(store);

        Random rnd = new Random();
        for (StoreItem item : store.getStoreItems()) {
            item.increaseQuantity(rnd.nextInt(10) + 1);
        }
        System.out.println(store);
    }
}
