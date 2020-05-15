package edu.academy.homework4;

public enum ECountry implements Info {
    BELARUS(12, 34), RUSSIA(23, 56), UKRAINE(45, 75),
    POLAND(455, 54), LATVIA(345, 5),
    FRANCE(345, 53), TURKEY(65, 7), ITALY(67, 8),
    USA(34, 43), MEXICO(42,424);

    private int quantity;
    private int square;

    public static ECountry valueOFIgnoreCase(String name){// возвращает из enum игнорируя регистр
        return valueOf((name.toUpperCase()));
    }

    ECountry(int getQuantity, int getSquare) {
        this.quantity = getQuantity;
        this.square = getSquare;
    }


    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public int getSquare() {
        return square;
    }
    @Override
    public String toString() {
        return name() + "{" + "quantity = " + quantity + ", square = " + square + '}';
    }
}











