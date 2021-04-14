package com.rcs.classwork.Day22;

public abstract class StoreItem {
    private double price;
    private int quantity;

    public double getFullPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int count) {
        this.quantity += count;
    }

    public void decreseQuantity(int count) {
        this.quantity -= count;
    }

    abstract double getPrice(boolean isClient);
}
