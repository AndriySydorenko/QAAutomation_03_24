package com.hillel.sydorenko.homework1;

public class MainWithVoid {
    public static void main(String[] args) {
        printStudentCard("Andrii", "Sydorenko", "0936255436", 27);
        printStudentCard("Dmytro", "Ivanenko", "1234567890", 30);

    }

    public static void printStudentCard(String firstName, String lastName, String phone, int age) {
        System.out.println("Student: " + firstName + " " + lastName + ". " + "Age: " + age + " " + "phone: " + phone);
    }
}
