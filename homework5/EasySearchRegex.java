package edu.academy.homework5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasySearchRegex {


        public static int searchWithPattern(Pattern pattern, String text){
            int count = 0;
            Matcher m = pattern.matcher(text);
            while (!m.hitEnd()) {
                if (m.find()) {
                    count++;
                }
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