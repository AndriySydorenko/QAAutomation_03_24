package com.hillel.sydorenko.homework5;

import java.util.Arrays;

public class Manager extends Employee {
    final private String lastName;
    Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public void setTeamMembers(Employee... members) {
        this.team = members;
    }

    @Override
    String getPosition() {
        return "Manager";
    }

    @Override
    String getSeniority() {
        return " ";

    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getInfo() {
       return getName() + " is a " + getSeniority() + " " + getPosition() +" and has a team of "+ team.length + "  members: " + Arrays.toString(team);
    }
}
