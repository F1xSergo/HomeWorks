package edu.academy.sixhomework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MapMainHomeWork2 {
    public static void main(String[] args) {
        String filePath = readAllBytesJava("f:/git/src/edu/academy/fivehomework/Война и мир.txt");
        String[] words = filePath.toLowerCase().split(" ");


        Map<String, Integer> unsortMap = new HashMap<String, Integer>();
        for (String word : words) {
            if (unsortMap.containsKey(word)) {
                unsortMap.put(word, unsortMap.get(word) + 1);
            } else {
                unsortMap.put(word, 1);
            }
        }

        System.out.println("\nSorted Map......By Value");
        Map<String, Integer> sortedMap = sortByValue(unsortMap);
        printMap(sortedMap);

    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

// 1. Конвертировать карту в список карт
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

// 2. Сортировать список с Collections.sort (), предоставить собственный компаратор
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else {
                    return 0;
                }
//                return (o1.getValue()).compareTo(o2.getValue());
            }
        });



        // 3. Зациклить отсортированный список и поместить его в новый порядок вставки Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
         return sortedMap;
         }

         public static <K, V> void printMap(Map<K, V> map) {
             for (Map.Entry<K, V> entry : map.entrySet()) {
                 System.out.println(entry.getKey() + " : " + entry.getValue());

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


