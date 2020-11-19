package com.company;

public abstract class Animal implements Drawable, SoundProducable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String draw() {

        return null;
    }
    public String callSound(){

        return null;
    };

}
