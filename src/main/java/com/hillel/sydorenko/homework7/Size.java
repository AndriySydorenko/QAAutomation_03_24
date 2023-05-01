package com.hillel.sydorenko.homework7;

public enum Size {
    SMALL("S", 10, 10),
    MEDIUM("M", 20, 20),
    LARGE("L", 30, 30),
    EXTRA_LARGE("XL", 40, 40);

    private String shortName;
    private int width;
    private int length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return getShortName() + " size: width = " + getWidth() + " length = " + getLength();
    }
}
