package com.hillel.sydorenko.homework5;

public class AutomationEngineer extends Employee {
final private String lastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    String getPosition() {
        return "Automation Engineer";
    }

    @Override
    String getSeniority() {
        return "Senior";

    }

}
