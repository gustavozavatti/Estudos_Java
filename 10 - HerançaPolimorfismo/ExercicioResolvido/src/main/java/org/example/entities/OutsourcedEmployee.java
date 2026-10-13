package org.example.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;
    public static final double BONUS_RATE = 1.1;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public final Double payment() {
        return super.payment() + BONUS_RATE * additionalCharge;
    }
}
