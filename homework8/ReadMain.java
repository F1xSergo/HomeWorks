package edu.academy.homework8;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadMain {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.bin"))) {
            List<Students> list = new ArrayList<>();
            for (int i = 0; i < "students.bin".length(); i++) {
            while (true) {

                Students st = (Students) ois.readObject();
                list.add(st);
                if (list != null) {
                    System.out.println(list);
                } else {
                    break;
                }


//                for (int i = 0; i < "students.bin".length(); i++) {


                while (true) {
                    String line = String.valueOf(ois.readObject());

                    if (line != null) {
                        //System.out.println(line);
                    } else {
                        break;
                    }

                }
            }
                }


            } catch(EOFException e){
                //e.printStackTrace();
            } catch(IOException | ClassCastException | ClassNotFoundException e){
                e.printStackTrace();
            }

        }

    }
