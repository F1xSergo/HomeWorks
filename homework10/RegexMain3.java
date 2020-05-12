package edu.academy.homework10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RegexMain3 {
    public static void main(String[] args) {

        try (Stream<String> str = Files.lines(Paths.get("Benign_list_big_final.csv"))) {
            String[] array = str.distinct().toArray(value -> new String[value]);
//            System.out.println("array = " + Arrays.asList(array));
            List<String> urls = Arrays.asList(array);

            Pattern pattern = Pattern.compile("(http|https)://([\\w\\d]*)([.\\w]+)/?.* ");
            for (String url : urls) {
                Matcher matcher = pattern.matcher(url);
                int count = 0;
                boolean matches = matcher.matches();

                if (matches) {
                 //   System.out.println(url + " : " + matcher.matches());
                   // System.out.println("G0 " + matcher.group(0));

                    if (matcher.groupCount() > 0) {
                        System.out.println("G1 " + matcher.group(1));
                    }
                    if (matcher.groupCount() > 1) {
                        System.out.println("G2 " + matcher.group(2) + matcher.group(3));
                    } if (matcher.groupCount() > 2) {
                        System.out.println("G3 " + matcher.group(3).replaceFirst("\\.","") );
                    }
                    System.out.println();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


