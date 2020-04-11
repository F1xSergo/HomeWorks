package edu.academy.fivehomework;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearch implements ISearchEngine {
     String filePath = "f:/git/src/edu/academy/fivehomework/Война и мир.txt";
     String a = " Война";
     String b = " и ";
     String c = " мир ";
     // String text;


    @Override
    public  int search(String text, String word) {
        this.filePath = word;
        this.a = text;
        this.b = text;
        this.c = text;
        text = text.toLowerCase();
        word = word.toLowerCase();
        // this.text = text;

        int i = word.indexOf(text);
        int count = 0;
        while (i >= 0) {
            count++;
            i = word.indexOf(text, i + 1);
        }
        return count;
    }

        public static String readAllBytesJava (String filePath){
            String content = "";
            try {
                content = new String(Files.readAllBytes(Paths.get(filePath)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content;
        }
    }





