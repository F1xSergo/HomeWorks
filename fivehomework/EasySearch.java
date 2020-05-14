package edu.academy.fivehomework;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearch implements ISearchEngine {

     String a = " Война";
     String b = " и ";
     String c = " мир ";
    @Override
    public  int search(String text, String word) {
        word = word.toLowerCase();//игонор регистра
        text = text.toLowerCase();

        int i = word.indexOf(text);//счетчик слов  через метод indexOf
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





