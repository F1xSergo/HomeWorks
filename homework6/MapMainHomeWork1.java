package edu.academy.homework6;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MapMainHomeWork1 {
    public static void main(String[] args) {
        String filePath = readAllBytesJava("f:/git/src/edu/academy/fivehomework/Война и мир.txt");
        String[] words = filePath.toLowerCase().split(" ");

        Map<String, Integer> data = new HashMap<>();

        for (String word : words) {
            if (data.containsKey(word)) {
                data.put(word, data.get(word) + 1);
            } else {
                data.put(word, 1);
            }
        }

            for (Map.Entry<String, Integer> entry : data.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());

            }
        }

        private static String readAllBytesJava (String filePath){
            String content = "";
            try {
                content = new String(Files.readAllBytes(Paths.get(filePath)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content;
        }
    }

