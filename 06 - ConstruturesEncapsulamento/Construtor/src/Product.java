package org.example;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return quantity*price;
    }

    public void addProduct(int quantityAdd){
        quantity += quantityAdd;
        System.out.println(toString());
    }

    public void removeProduct(int quantityRemove){
        quantity -= quantityRemove;
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return "Product data: " + name + ", $ " + price + ", " + quantity + " units, Total: " + totalValueInStock();
    }
}

