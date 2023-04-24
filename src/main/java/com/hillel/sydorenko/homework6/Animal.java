package com.hillel.sydorenko.homework6;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract void greets();
}
