package edu.academy.fourthhomework;

public enum Country implements Info {
    BELARUS(12,34), RUSSIA(23,56), UKRAINE(45,75),
    POLAND(455,54), LATVIA(345,5),
    FRANCE(345,53), TURKEY(65,7), ITALY(67,8),
    USA(34,43), MEXICO(23,43);
    int quantity;
    int square;
    Country(int quantity,int square ) {
        this.quantity = quantity;
        this.square = square;
    }

//    public int uantity() {
//        return quantity;
//    }
//
//    public int square() {
//        return square;
//    }

    public void Square(int quantity,int square ) {

    }

    public void Quantity(int quantity,int square ) {

    }


}





