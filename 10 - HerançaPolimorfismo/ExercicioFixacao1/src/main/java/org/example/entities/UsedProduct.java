package org.example.entities;
import java.time.LocalDate;

public class UsedProduct extends Product{

    private final LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public String priceTag(){
        return super.priceTag() + " (Manufacture date: " + manufactureDate + ")";
    }
}
