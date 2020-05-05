package edu.academy.homework9;

import java.io.*;
import java.util.Random;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("studentsForStream.bin"));
        Random rnd = new Random();
        Stream
                .generate(() -> new StudentsForStream(rnd.nextInt(10), rnd.nextInt(100)))
                .limit(1000)
                .filter(val -> val.getMarks() >= 7)
                .peek(System.out::print)
                .forEach(val -> {
                    try {
                        out.writeObject(val);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentsForStream.bin"))) {
            int i = -1;
            while ((i = ois.available()) != -1) {
                StudentsForStream st = (StudentsForStream) ois.readObject();
                System.out.println(st);
            }
        }catch (EOFException e){
//            e.printStackTrace();
        }
    }
}
