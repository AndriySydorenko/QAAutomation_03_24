package com.hillel.sydorenko.homework6;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog dog) {
        System.out.println("Woooooow");
    }
    public void greets(BigDog dog) {
        System.out.println("WOOOOOOOOOOOOOOW");
    }
}
