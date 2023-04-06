package com.hillel.sydorenko.homework4;

public class Animal {
//    Создать два класса Animal (super,родительский,базовый) и класс Cat (наследник).
//
//            -Класс Animal должен иметь следуюющие приватные поля vegetarian (boolean ), eats (String ), noOfLegs (int). Должен иметь гетеры и сетеры для, а также два конструктора: первый принимает все параметры полей, второй без параметров.
//
//-Класс Cat должен расширять (наследовать) класс Animal. должен иметь приватное поле color (String). Сетер и гетер для него. иметь два конструктора:
//
//            --первый принимает параметры все параметры для конструирования себя (color) и родительскогокласса
//
//-- второй принимает параметры для конструирования родительского, класса color-по умолчанию

private boolean vegetarian;
private String eats;
private int noOfLegs;

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }
// Коструктор без параметрів і з дефолтними значеннями
    public Animal() {
        this(false, "meat", 4);
    }
}
