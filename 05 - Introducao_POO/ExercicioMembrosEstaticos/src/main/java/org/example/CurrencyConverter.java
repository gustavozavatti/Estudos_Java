package org.example;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convert(double price, double amount) {
        return price * amount * (1.0 + IOF);
    }
}
