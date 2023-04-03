package com.hillel.sydorenko.homework3;

public class Cacl {
    public static int calculation(int firstNumber, int secondNumber, String operator) {
        int result = 0;
        switch (operator) {
            case "Addition":
                result = addition(firstNumber, secondNumber);
                break;
            case "Subtraction":
                result = subtraction(firstNumber, secondNumber);
                break;
            case "Multiplication":
                result = multiplication(firstNumber, secondNumber);
                break;
            case "Division":
                result = division(firstNumber, secondNumber);
                break;
        }
        return result;
    }


    static int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;

    }

    static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;

    }

    static int division(int firstNumber, int secondNumber) {
       return firstNumber / secondNumber;
    }
}
