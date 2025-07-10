package org.example.model;

public class product {

    public String id;
    public String name;
    public String category;
    public String brand;
    public double price;
    public int stock;

    public product(String id, String name, String category, String brand, double price, int stock) {

        this.id = id;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.stock = stock;

    }
}
