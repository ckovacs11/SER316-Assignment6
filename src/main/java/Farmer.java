package main.java;

import java.util.Random;

public class Farmer {
    
    String attribute;
    
    
    //create a new farmer. The farmer has a chance of having a random attribute.
    public Farmer() {
        
        Random rand = new Random();
        int randInt = rand.nextInt(7);
        
        switch(randInt) {
        case 0: this.attribute = "Weevil destroyer";
        break;
        case 1: this.attribute = "Former horse jockey";
        break;
        case 2: this.attribute = "Expert farmer";
        break;
        
        }
        System.out.print("Hired a new farmer!");
        
        if(this.attribute != null) {
            System.out.print(" This farmer also has the attribute: " + this.attribute);
            if(this.attribute.equalsIgnoreCase("Weevil destroyer")) {
                System.out.print(": Weevils can no longer destroy corn on this farm.");
                
            } else if(this.attribute.equalsIgnoreCase("Former horse jockey")) {
                System.out.print(": Horses will now make more money at horse races");
                
            } else {
                System.out.print(": All resources on this farm now generate more income");
                
            }
        } 
            System.out.println();
            
        
       
        
    }

}
