package com.company;

public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculatePerimetr() {
        return (2 * Math.PI * radius);
    }

    public Circle(String name, int radius) {
        super.setName(name);
        this.radius = radius;
    }

       @Override
    public String draw() {
        return "🔴";
    }
}