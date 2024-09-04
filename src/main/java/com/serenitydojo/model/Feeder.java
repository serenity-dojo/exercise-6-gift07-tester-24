package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {

        if(animal.equals("cat")){
           return(isPremium) ? "salmon" : "tuna";
        }
       else if (animal.equals("Dog")){
          return(isPremium) ? "steak" : "anyfood";
        }
        else if(animal.equals("Hamster")){
            return(isPremium) ? "lettuce" : "cabbage";
        }

        return "unknown";

    }
}
