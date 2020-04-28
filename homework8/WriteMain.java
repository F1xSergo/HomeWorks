package edu.academy.homework8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteMain {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.bin"))) {
            for (int i = 0; i < 100_000; i++) {
                Students st = new Students();
               oos.writeObject(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



