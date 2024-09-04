package com.serenitydojo;

public class Hamster extends Pet {
    String favoriteToy;
    public Hamster(String name, int age, String favoriteToy) {
        super(name,age);
        this.favoriteToy = favoriteToy;
    }
    public String getFavoriteToy(){
        return favoriteToy;
    }
    public String makeNoise(){
        return "Squeek";
    }
    public String play(){
        return "running in the wheel";
    }

}
