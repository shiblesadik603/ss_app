package com.example.myapplicationtest;

public class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
    }

    public void showColor() {
        System.out.println("Color: " + name);
    }
}
