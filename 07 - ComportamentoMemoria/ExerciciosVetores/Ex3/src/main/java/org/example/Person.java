package org.example;

public class Person {
    private String firstName;
    private String email;
    private int roomNumber;

    public Person(String firstName, String email, int roomsRented) {
        this.firstName = firstName;
        this.email = email;
        this.roomNumber = roomsRented;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomsRented() {
        return roomNumber;
    }

    @Override
    public String toString() {
       return this.roomNumber + ": " + this.firstName + ", " + this.email;
    }

}
