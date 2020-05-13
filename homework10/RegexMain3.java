package edu.academy.homework10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RegexMain3 {
    public static void mapAdditor(Map<String, Integer> map, List<String> list) {
        for (String word : list) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
    }

    public static void main(String[] args) {

        try (Stream<String> str = Files.lines(Paths.get("Benign_list_big_final.csv"))) {
            String[] array = str.distinct().toArray(value -> new String[value]);
           // System.out.println("array = " + Arrays.asList(array));
            List<String> urls = Arrays.asList(array);

//            Pattern pattern = Pattern.compile("(http|https)://([\\w\\d]*)([.\\w]+)/?.*");
            Pattern pattern = Pattern.compile("(http|https)://([\\w.]*\\.([\\w]*))/?.*");

            List<String> protocols = new ArrayList<>();
            List<String> domens = new ArrayList<>();
            List<String> upperDomens = new ArrayList<>();

            for (String url : urls) {
                Matcher matcher = pattern.matcher(url);

                boolean matches = matcher.matches();
                if (matches) {
//                    System.out.println(url + " : " + matcher.matches());
                    // System.out.println("G0 " + matcher.group(0));

                    if (matcher.groupCount() > 0) {
                        //   System.out.println("G1 " + matcher.group(1));
                        protocols.add(matcher.group(1));
                    }
                    if (matcher.groupCount() > 1) {
                        //   System.out.println("G2 " + matcher.group(2)); //+ matcher.group(3));
                        domens.add(matcher.group(2));
                    }
                    if (matcher.groupCount() > 2) {
                        //    System.out.println("G3 " + matcher.group(3)); //.replaceFirst("\\.","") );
                        upperDomens.add(matcher.group(3));
                    }
                }
            }
//            // posmotrel skok bez dubliicatov
//Collection<String> mapProtocols = new HashSet<>(protocols);
//Collection<String> mapDomens = new HashSet<>(domens);
//Collection<String> mapUpperProtocols = new HashSet<>(upperDomens);

            // Преобразовать в map, где первый символ ключ, второй символ значение
            Map<String, List<String>> groups1 = protocols
                    .stream()
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.groupingBy((p) -> p.substring(0, 1)));

          //  System.out.println("groups1 = " + groups1);
            List<Map.Entry<String, List<String>>> list1 = new ArrayList<>(groups1.entrySet());
            System.out.println("Топ 2 часто встречающихся протоколов protocols адресов:");
            for (int i = 0; i < 2; i++) {
                System.out.println(list1.get(i));
            }
//            long count1 = protocols.stream().filter("https"::equals).count();
//            long count2 = protocols.stream().filter("http"::equals).count();
//            System.out.println("https = " + count1);
//            System.out.println("http = " + count2);

//            Map<String, List<String>> groups2 = domens
//                    .stream()
//                    .sorted(Comparator.naturalOrder())
//                    .collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
//          // System.out.println("groups2 = " + groups2);
//            List<Map.Entry<String, List<String>>> list2 = new ArrayList<>(groups2.entrySet());
//            System.out.println("Топ 10 часто встречающихся протоколов domens адресов:");
//            for (int i = 0; i < 10; i++) {
//                System.out.println(list2.get(i));
//            }





            Map<String, List<String>> groups3 = upperDomens
                    .stream()
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
            //System.out.println("groups3 = " + groups3);




//                    System.out.println(protocols.stream().filter(val -> val.matches(matcher.group(1))).count());
//                   System.out.println(groups2.values().stream().count());
//                    System.out.println(upperDomens.stream().count());



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


