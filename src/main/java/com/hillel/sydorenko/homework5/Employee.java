package com.hillel.sydorenko.homework5;

abstract class Employee {
    final private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return "";
    }


    abstract String getPosition();

    abstract String getSeniority();

    public String getInfo() {
        return name + " is a " + getSeniority() + " " + getPosition();
    }
    @Override
    public String toString() {
        return getName();
    }
}
