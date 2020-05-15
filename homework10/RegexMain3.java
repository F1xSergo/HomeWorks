package edu.academy.homework10;

import edu.academy.homework6.SortedByValue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RegexMain3 {
    // пишем статический метод для вставок уникальных выборок (в качестве ключей) с колличеством их повторений
     public static void mapAdditor (Map<String, Integer> map, List<String> list) {
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

            //Создаем чистые листы для нужных нам выборок из паттерна

            List<String> protocols = new ArrayList<>();
            List<String> domens = new ArrayList<>();
            List<String> upperDomens = new ArrayList<>();

            for (String url : urls) {// пишем цикл проверок соответствия адресов паттерну и выводим нужные выборки по группам (сразу добавляем каждую выборку в свой лист)
                Matcher matcher = pattern.matcher(url);

                boolean matches = matcher.matches();
                if (matches) {// выбираем только "чистые" адреса и только у "чистых" записываем в листы выборки
                    protocols.add(matcher.group(1));
                    domens.add(matcher.group(2));
                    upperDomens.add(matcher.group(3));
//                    System.out.println(url + " : " + matcher.matches());
                    // System.out.println("G0 " + matcher.group(0));

                    if (matcher.groupCount() > 0) {
                        //   System.out.println("G1 " + matcher.group(1));
                    }
                    if (matcher.groupCount() > 1) {
                        //   System.out.println("G2 " + matcher.group(2)); //+ matcher.group(3));
                    }
                    if (matcher.groupCount() > 2) {
                        //    System.out.println("G3 " + matcher.group(3)); //.replaceFirst("\\.","") );
                    }
                }
            }

//            // posmotrel skok bez dubliicatov
//                  //Collection<String> mapProtocols = new HashSet<>(protocols);
//                  //Collection<String> mapDomens = new HashSet<>(domens);
//                  //Collection<String> mapUpperProtocols = new HashSet<>(upperDomens);
//
// //            Преобразовать в map, где первый символ ключ, второй символ значение
//            Map<String, List<String>> groups1 = protocols
//                    .stream()
//                    .sorted(Comparator.naturalOrder())
//                    .collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
//            System.out.println("groups1 = " + groups1);
//
//            //long count1 = protocols.stream().filter("https"::equals).count();
//            //long count2 = protocols.stream().filter("http"::equals).count();
//            //System.out.println("https = " + count1);
//            //System.out.println("http = " + count2);
//
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
//
//            Map<String, List<String>> groups3 = upperDomens
//                    .stream()
//                    .sorted(Comparator.naturalOrder())
//                    .collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
//            //System.out.println("groups3 = " + groups3);

            // Заводим для каждого листа выборок свои Мапы для будущей сортировки
            Map<String, Integer> mapOfProtocols = new LinkedHashMap<>();
            Map<String, Integer> mapOfDomens = new LinkedHashMap<>();
            Map<String, Integer> mapOfUpperDomens = new LinkedHashMap<>();

            // добавляем элементы листов выборок в Мапы с помощью нашего статического метода
            mapAdditor(mapOfProtocols, protocols);
            mapAdditor(mapOfDomens, domens);
            mapAdditor(mapOfUpperDomens, upperDomens);

            // заносим отсортированные Map-ы выборок в новые Map сохраняя порядок вставки
            Map<String, Integer> sortedProtocols = SortedByValue.sortByValue(mapOfProtocols);
            Map<String, Integer> sortedDomens = SortedByValue.sortByValue(mapOfDomens);
            Map<String, Integer> sortedUpperDomens = SortedByValue.sortByValue(mapOfUpperDomens);

            // выводим ТОП-10 часто употребляемых протоколов
            List<Map.Entry<String, Integer>> list1 = new ArrayList<>(sortedProtocols.entrySet());
            System.out.println("Топ 2 часто встречающихся протоколов Protocols адресов:");
            for (int i = 0; i < 2; i++) {
                System.out.println(list1.get(i));
            }
            System.out.println();

            // выводим ТОП-10 часто употребляемых доменов
            List<Map.Entry<String, Integer>> list2 = new ArrayList<>(sortedDomens.entrySet());
            System.out.println("Топ 10 часто встречающихся доменов URL адресов:");
            for (int i = 0; i < 10; i++) {
                System.out.println(list2.get(i));
            }
            System.out.println();

            // выводим ТОП-10 часто употребляемых доменов верхнего уровня
            List<Map.Entry<String, Integer>> list3 = new ArrayList<>(sortedUpperDomens.entrySet());
            System.out.println("Топ 10 часто встречающихся доменов верхнего уровня URL адресов:");
            for (int i = 0; i < 10; i++) {
                System.out.println(list3.get(i));
            }
            System.out.println();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


