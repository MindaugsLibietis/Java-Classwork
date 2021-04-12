package com.rcs.classwork.Day21.HelperClasses;


import com.rcs.classwork.Day21.custumerAccounts.Account;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountStorage {

    public static void saveToFile(List<Account> accounts, String fileName) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName);
            ObjectOutputStream objectSteram = new ObjectOutputStream(fileStream);
            objectSteram.writeObject(accounts);
            objectSteram.close();
            fileStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        public static List<Account> readFromFile(String fileName) {
            List<Account> accountList = new ArrayList<>();
            try {
                FileInputStream inputStream = new FileInputStream("accounts");
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                accountList = (ArrayList)objectInputStream.readObject();
                objectInputStream.close();
                inputStream.close();
            } catch (Exception ex) {
            }
            return accountList;
        }
    }
