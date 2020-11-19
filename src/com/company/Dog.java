package com.company;

public class Dog extends Animal {

    private String breed;
    private  int age;

    public Dog (String name,String breed,int age){
       super.setName(name);
       this.breed=breed;
       this.age=age;
    };

    public String draw (){
        return "\uD83D\uDC15";
    }


    @Override
    public String callSound() {
        return " Гав-гав-гав ";

    }

    public String getInfoDog(){
        var s = super.getName() + " " + draw() + " :  " + callSound() + "";
        return s;
    }
}
