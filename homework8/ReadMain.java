package edu.academy.homework8;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReadMain {
    public static void main(String[] args) {
        List<Students> list = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.bin"))) {


            int i = -1;
            while((i = ois.available()) != -1) {
                Students st = (Students) ois.readObject();
                list.add(st);
                //System.out.println(list.toString());
          //    System.out.println((char)i);



            }
            Collections.sort(list);
            FileWriter fw = new FileWriter("students.txt");

            for (Students st : list) {
                String name = st.name;
                fw.write(name);
                System.out.println(name.toString());
            }
          FileReader fr =






//            // for (int i = 0; i < "students.bin".length(); i++) {
////            while (true) {
////
////                Students st = (Students) ois.readObject();
////                list.add(st);
////
////                if (list != null) {
////
////                    System.out.println(list);
////                } else {
////                    break;
////                }
////            }
////
////
////            FileWriter writer = new FileWriter("studentsList.txt");
////            writer.write("Сортированный по алфавиту список будет иметь вид:");
////            for (Students st: list) {
////                String name = st.name;
////                writer.write(name+System.getProperty("line.separator"));
////                System.out.println(name);
//            }
//                while (true) {
//                    String line = String.valueOf(ois.readObject());
//
//                    if (line != null) {
//                        //System.out.println(line);
//                    } else {
//                        break;
//                    }


            } catch(EOFException e){
                //e.printStackTrace();
            } catch(IOException | ClassCastException | ClassNotFoundException e){
                e.printStackTrace();
            }

        }

    }
