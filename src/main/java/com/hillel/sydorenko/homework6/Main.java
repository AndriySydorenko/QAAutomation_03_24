package com.hillel.sydorenko.homework6;

public class Main {
    public static void main(String[] args) {
        BigDog bigDog = new BigDog("OGROMNIY PES");
        Dog dog = new Dog("dog");
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(bigDog);
    }
}
