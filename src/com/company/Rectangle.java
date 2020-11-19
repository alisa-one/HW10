package com.company;

public class Rectangle extends Figure {

    private int Aa;
    private int Bb;

    public int getAa() {
        return Aa;
    }

    public void setAa(int aa) {
        Aa = aa;
    }

    public int getBb() {
        return Bb;
    }

    public void setBb(int bb) {
        Bb = bb;
    }

    public Rectangle(String name, int Aa, int Bb) {
        super.setName(name);
        this.Aa = Aa;
        this.Bb = Bb;
    }
    public double calculatePerimetr() {
        return 2 * (Aa + Bb);
    }

    @Override
    public String draw() {
        return "🟩🟩";
    }


}
