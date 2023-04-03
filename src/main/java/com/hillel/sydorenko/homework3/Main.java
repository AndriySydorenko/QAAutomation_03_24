package com.hillel.sydorenko.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = enterValue("First number");
        int b = enterValue("Second number");
        String operator = enterFunction();

        if (operator == "Division" || b == 0 && operator == "Division" || a == 0) {
            System.out.println("You can't divide the number by 0!");
            System.out.println("Please restart program");
            System.exit(0);
        } else {
            switch (operator) {
                case "Addition":
                    System.out.println("Your formula: " + a + " " + "+" + " " + b);
                    System.out.println("Result: " + Cacl.calculation(a, b, operator));
                    break;
                case "Subtraction":
                    System.out.println("Your formula: " + a + " " + "-" + " " + b);
                    System.out.println("Result: " + Cacl.calculation(a, b, operator));
                    break;
                case "Multiplication":
                    System.out.println("Your formula: " + a + " " + "*" + " " + b);
                    System.out.println("Result: " + Cacl.calculation(a, b, operator));
                    break;
                case "Division":
                    System.out.println("Your formula: " + a + " " + "/" + " " + b);
                    System.out.println("Result: " + Cacl.calculation(a, b, operator));
                    break;
            }
        }


    }


    public static int enterValue(String a) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        System.out.println("Pleate enter value for: " + a);
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong data. Please enter numeric value!");
                scanner.nextLine();
            }
        }
        return temp;
    }

    public static String enterFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a mathematical operations : Addition, Subtraction, Multiplication, Division");
        String temp = scanner.nextLine();
        switch (temp) {
            case "Addition":
                System.out.println("You chosen - Addition");
                break;
            case "Subtraction":
                System.out.println("You chosen - Subtraction");
                break;
            case "Multiplication":
                System.out.println("You chosen - Multiplication");
                break;
            case "Division":
                System.out.println("You chosen - Division");
                break;
            default:
                System.out.println("Unknown mathematical operations, please restart program");
                System.exit(0);
        }
        return temp;
    }
}

