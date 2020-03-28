package edu.academy.fourthhomework;

public enum ECountry implements Info {
    BELARUS(12, 34), RUSSIA(23, 56), UKRAINE(45, 75),
    POLAND(455, 54), LATVIA(345, 5),
    FRANCE(345, 53), TURKEY(65, 7), ITALY(67, 8),
    USA(34, 43), MEXICO(42,424);

    int quantity;
    int square;

    ECountry(int quantity, int square) {
        this.quantity = quantity;
        this.square = square;
    }
    public void info(int quantity, int square) {
        System.out.println(BELARUS);

    }

    @Override
    public String toString() {
        return "info{" + "quantity=" + quantity + ", square=" + square + '}';
    }



}











