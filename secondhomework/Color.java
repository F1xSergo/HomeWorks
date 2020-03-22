package edu.academy.secondhomework;

public class Color {
    //константы

    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int VIOLET = 7;
    int Number;
//конструктор
    public Color(int Number) {
        this.Number = Number;
    }
//Метод
        public int getNumber () {
            return Number;
        }
//Метод 2
        public String getName () {
            String name;
//switch внутри мутода 2
            switch (Number) {
                case RED:
                    name = "Красный";
                    break;
                case ORANGE:
                    name = "Оранжевый";
                    break;
                case YELLOW:
                    name = "Желтый";
                    break;
                case GREEN:
                    name = "Зеленый";
                    break;
                case BLUE:
                    name = "Голубой";
                    break;
                case INDIGO:
                    name = "Синий";
                    break;
                case VIOLET:
                    name = "Фиолет";
                    break;
                default:
                    name = "Неизвeстно";
            }
            return name;
        }
    }







