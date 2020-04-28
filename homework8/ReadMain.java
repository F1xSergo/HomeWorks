package edu.academy.homework8;

import java.io.*;
import java.util.*;

public class ReadMain {
    public static void main(String[] args) throws IOException {
        List<Students> list = new ArrayList<>();
        Set<Students> set = new TreeSet<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.bin"))) {

            int i = -1;
            while ((i = ois.available()) != -1) {
                Students st = (Students) ois.readObject();
                list.add(st);
                set.add(st);
            }
        } catch (EOFException e) {
            //e.printStackTrace();
        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            e.printStackTrace();
        }



        //list
        Collections.sort(list);
        FileWriter fw = new FileWriter("students_list.txt");
        for (Students st : list) {
            String name = st.name;
            fw.write(name + System.getProperty("line.separator"));
            // System.out.println(name);
        }
        //set
        FileWriter fw1 = new FileWriter("students_set.txt");
        for (Students st : set) {
            String name = st.name;
            fw1.write(name + System.getProperty("line.separator"));
            //System.out.println(name);
        }
        fw.close();
        fw1.close();
    }
}



//                while (true) {
//                    String line = String.valueOf(ois.readObject());
//
//                    if (line != null) {
//                        //System.out.println(line);
//                    } else {
//                        break;
//                    }