package com.rcs.classwork.Day21.custumerAccounts;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream("accounts");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            accountList = (ArrayList)objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
        } catch (Exception ex) {
//            ex.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Veiciet kontu ievadi.");
        int id = 1;
        if (accountList.size() > 0) {
            id = accountList.get(accountList.size() - 1).getId() + 1;
        }
        while (true) {
            System.out.print("IBAN: ");
            String IBAN = sc.nextLine();
            System.out.print("Klienta vārds: ");
            String name = sc.nextLine();
            System.out.print("Klienta uzvārds: ");
            String surname = sc.nextLine();
            System.out.print("Klienta dzimšanas datums(YYYY-MM-DD) : ");
            String dateInput = sc.nextLine();
            System.out.print("Konta bilance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            Account account = new Account(id, IBAN, new Customer(id, name, surname, LocalDate.parse(dateInput)), balance);
            accountList.add(account);
            id++;

            System.out.println("Turpināt? (N) :");
            String action = sc.nextLine();
            if (action.equalsIgnoreCase("N")) {
                break;
            }
        }

        for (Account account : accountList) {
            System.out.println(account);
        }

        try {
            FileOutputStream fileStream = new FileOutputStream("accounts");
            ObjectOutputStream objectSteram = new ObjectOutputStream(fileStream);
            objectSteram.writeObject(accountList);
            objectSteram.close();
            fileStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
