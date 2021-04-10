package com.rcs.classwork.Day21.custumerAccounts;

import com.rcs.classwork.Day21.HelperClasses.*;
import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String IBAN;
    private double balance;
    private Customer customer;

    public Account(int id, String IBAN, Customer customer) {
        this.id = id;
        this.IBAN = IBAN;
        this.customer = customer;
        this.balance = 0;
    }

    public Account(int id, String IBAN, Customer customer, double balance) {
        this(id, IBAN, customer);
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getIBAN() {
        return this.IBAN;
    }

    public double getBalance() {
        return this.balance;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName() + " " + customer.getSurname();
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (NumberHelper.round(this.balance) >= NumberHelper.round(amount)){
            this.balance -= amount;
        } else {
            System.out.println("Nepietiekams atlikums");
        }
    }
    @Override
    public String toString() {
        return  String.format("id: %d\nCustomer: %s\nIBAN: %s\nBilance: %.2f", this.id, this.customer.toString(), this.IBAN, this.balance);
    }

}
