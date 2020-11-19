package com.company;

public class Triangle extends Figure{
    private int A;
    private int B;
    private int C;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }
    public double calculatePerimetr() {
        return A+B+C;
    }

    public Triangle(String name,int A,int B,int C){
        super.setName(name);
        this.A=A;
        this.B=B;
        this.C=C;
    }

    @Override
    public String draw() {
        return"🔺";
    }


}
