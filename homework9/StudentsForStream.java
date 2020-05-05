package edu.academy.homework9;

import java.io.Serializable;

public class StudentsForStream implements Serializable {
   private int marks;
   private int name;

    public StudentsForStream(int marks, int name) {
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
//public class Student {
//    private String name;
//    private double mark;
//
//    public String getName() {
//        return name;
//    }
//
//    public double getMark() {
//        return mark;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", mark=" + mark +
//                '}';
//    }
//
//
//    public Student() {
//        int nameLength = (1 + (int) (Math.random()*10));// Генерируем длину имени
//
//        Random rand = new Random();
//
//        StringBuilder nameBuilder = new StringBuilder();
//
//        for (int i = 0; i < nameLength; i++) {
//            List<Character> alphabet = Arrays.asList(
//                    'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
//                    'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
//                    'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
//                    'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
//            nameBuilder.append(alphabet.get(rand.nextInt(alphabet.size())));
//        }
//
//        this.name = nameBuilder.toString();
//
//        this.mark =  Math.random()*10;
//
//
//
//
//
//    }
//}
