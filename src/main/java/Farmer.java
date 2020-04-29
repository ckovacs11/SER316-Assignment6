package main.java;

import java.util.Random;

public class Farmer {
    
    String attribute;
    Farm farm;
    
    
    //create a new farmer. The farmer has a chance of having a random attribute.
    public Farmer(Farm f) {
        this.farm = f;
        this.attribute = "";
        Random rand = new Random();
        int randInt = rand.nextInt(7);
        
        switch (randInt) {
            case 0: this.attribute = "Weevil destroyer";
                break;
            case 1: this.attribute = "Former horse jockey";
                break;
            case 2: this.attribute = "Expert farmer";
                break;
            default:
                break;
        
        }
        System.out.print("Hired a new farmer!");
  
        if (this.attribute.equalsIgnoreCase("Weevil destroyer")) {
            System.out.print(" This farmer also has the attribute '" + this.attribute + "'");
            System.out.print(": Weevils can no longer destroy corn on this farm.");
                
        } else if (this.attribute.equalsIgnoreCase("Former horse jockey")) {
            
            System.out.print(" This farmer also has the attribute '" + this.attribute + "'");
            System.out.print(": Horses will now make more money at horse races");
                
        } else if (this.attribute.equalsIgnoreCase("Expert farmer")) {
            
            System.out.print(" This farmer also has the attribute '" + this.attribute + "'");
            System.out.print(": All resources on this farm now generate more income");
                
        }
         
        System.out.println();
            
        
       
        
    }
    
    public int work() {
        int horseCount = 0;
        if (this.attribute.equalsIgnoreCase("weevil destroyer")) {
            return -1;
        } else if (this.attribute.equalsIgnoreCase("former horse jockey")) {
            for (int i = 0; i < farm.getResources().size(); i++) {
                
                if (farm.getResources().get(i).getClass() == Horse.class 
                    ||
                    farm.getResources().get(i).getClass() == HorseDecorator.class) {
                    horseCount++;
                }
            }
            return 30 * horseCount; 
        } else if (this.attribute.equalsIgnoreCase("expert farmer")) {
            return 10 * farm.getResources().size();
        } else {
            return 0;
        }
            
        
        
        
    }

}
