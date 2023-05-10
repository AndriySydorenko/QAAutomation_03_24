package com.hillel.sydorenko.homework8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "milk, butter, meat, milk";
        printWords(input);
    }

    static void printWords(String str) {
        String[] words = str.replaceAll(",.", " ").split(" ");

        Set<String> unique = new HashSet<>(Arrays.stream(words).toList());
        for (String word : unique) {
            System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
        }
    }
}
