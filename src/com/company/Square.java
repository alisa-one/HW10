package com.company;

public class Square extends Figure {
    private int C;

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    public Square(String name, int C){
        super.setName(name);
        this.C=C;
    }


    public double calculatePerimetr() {
        return C*4;
    }

    @Override
    public String draw() {
        return "🟦";
    }


}
