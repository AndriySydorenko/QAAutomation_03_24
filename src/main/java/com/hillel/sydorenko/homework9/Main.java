package com.hillel.sydorenko.homework9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "Value for key 11");
        map.put(192, "Value for key 192");
        map.put(100, "Value for key 100");
        map.put(14, "Value for key 14");
        map.put(22, "Value for key 22");
        map.put(7, "Value for key 7");

        printInfo(map);
    }
    public static void printInfo(Map<Integer, String> integerStringMap) {
        Map<Integer,String> temp = new TreeMap<>(integerStringMap);
        for (Map.Entry<Integer,String> l: temp.entrySet()){
            System.out.println(l);
        }
    }

//    public static void printInfo(Map<Integer, String> integerStringMap) {
//         Map<Integer,String> temp = new TreeMap<>(integerStringMap);
//         for (int l: temp.keySet()){
//             System.out.println("Key = " + l + ", Value = " + integerStringMap.get(l));
//        }
//    }
//    public static void printInfo(Map<Integer, String> integerStringMap) {
//        List<Integer> sortedKeys = new ArrayList<>(integerStringMap.keySet());
//        Collections.sort(sortedKeys);
//        for (Integer l : sortedKeys) {
//            System.out.println("Key = " + l + ", Value = " + integerStringMap.get(l));
//        }
//    }
}
