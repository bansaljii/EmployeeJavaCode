package com.rakuten;

public class Product {
    private int pid;
    private String name;
    private int quantity;
    private double pricepItem;
    public Product(int pid, String name, int quantity, double pricepItem) {
        this.pid = pid;
        this.name = name;
        this.quantity = quantity;
        this.pricepItem = pricepItem;
    }
    public int getPid() {
        return pid;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricepItem() {
        return pricepItem;
    }
}
