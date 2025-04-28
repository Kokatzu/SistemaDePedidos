package Entities;

import Utils.FormatUtils;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalProducts(){
        return quantity * price;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Produto: " + name + "  |  ");
        sb.append("QTD: " + quantity + "  |  ");
        sb.append("Preço: " + price + "\n");
        return sb.toString();
    }
}
