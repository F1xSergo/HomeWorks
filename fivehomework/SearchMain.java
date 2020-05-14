package edu.academy.fivehomework;
//         a = "Война";
//         b = "и";
//         c = "мир";

import java.util.regex.Pattern;

public class SearchMain {
    public static void main(String[] args) {

        String filePath = "f:/git/src/edu/academy/fivehomework/Война и мир.txt";

        System.out.println("redex самый точный");
        System.out.println(EasySearchRegex.searchWithPattern(Pattern.compile("\\s*\\b[Вв]ойна\\b\\s*?"), EasySearch.readAllBytesJava(filePath)));
        System.out.println(EasySearchRegex.searchWithPattern(Pattern.compile("\\s*\\b[Ии]\\b\\s*?"), EasySearch.readAllBytesJava(filePath)));
        System.out.println(EasySearchRegex.searchWithPattern(Pattern.compile("\\s*\\b[Мм]ир\\b\\s*?"),EasySearch.readAllBytesJava(filePath)));
        //52,14601,33

        EasySearch s = new EasySearch();
        System.out.println("Слово 'Война' встречается "+ s.search(s.a, s.readAllBytesJava(filePath)) + " раз.");//51
        System.out.println("Слово 'И' встречается "+ s.search(s.b, s.readAllBytesJava(filePath)) + " раз.");//13883
        System.out.println("Слово 'Мир' встречается "+ s.search(s.c, s.readAllBytesJava(filePath)) + " раз.");//18
    }
}


