package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Circle C1 = new Circle("Circle1:  ",8);
        Triangle T1 =new Triangle("Triangle1:  ",5,8,12);
        Square S1 = new Square("Square1:  ",8);
        Rectangle R1 = new Rectangle("Rectangle1:  ",10,8);
        Circle C2 = new Circle("Circle2:  ",16);
        Triangle T2 = new Triangle("Trangle2:  ",7,10,14);
        Dog Dog1 = new Dog("Dog1","Bulldog",7);

        Figure[] Figure = {C1,T1,S1,R1,C2,T2};

        for (int i = 0; i < Figure.length; i++) {
            System.out.println(Figure[i].getName()+" "+Figure[i].draw()+" "+Figure[i].calculatePerimetr());
        }

        Drawable[] Entity ={C1,T1,S1,R1,C2,T2, Dog1};

        for (int i = 0; i <Entity.length ; i++) {
            System.out.println(
              Entity[i].draw()
            );

        }
        System.out.println(Dog1.getInfoDog());
    }



}
