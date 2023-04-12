package com.hillel.sydorenko.homework5;

public class AngularDeveloper extends Employee{

    public AngularDeveloper(String name) {
        super(name);
    }

    @Override
    String getPosition() {
        return "Angular Developer";
    }

    @Override
    String getSeniority() {
        return "Middle";
    }

}
