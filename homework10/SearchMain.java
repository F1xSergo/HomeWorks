package edu.academy.homework10;
//         a = "Война";
//         b = "и";
//         c = "мир";

import edu.academy.homework5.EasySearch;
import edu.academy.homework5.EasySearchRegex;

import java.util.regex.Pattern;

public class SearchMain {
    public static void main(String[] args) {

        String filePath = "F:/git/src/edu/academy/homework10/Война и мир.txt";

        System.out.println("redex самый точный");
        System.out.println(EasySearchRegex.searchWithPattern(Pattern.compile("\\s*\\b[Вв]ойна\\b\\s*?"), EasySearch.readAllBytesJava(filePath)));
        System.out.println(EasySearchRegex.searchWithPattern(Pattern.compile("\\s*\\b[Ии]\\b\\s*?"), EasySearch.readAllBytesJava(filePath)));
        System.out.println(EasySearchRegex.searchWithPattern(Pattern.compile("\\s*\\b[Мм]ир\\b\\s*?"),EasySearch.readAllBytesJava(filePath)));
        //52,14601,33

    }
}


