package org.example.enums;

public enum Plan {
    BASIC ("Basic Plan", 1000),
    ADVANCE("Advance Plan", 1500);
    private String name;
    private int price;
    //Constructor
    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }
    //Getter
    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
}
