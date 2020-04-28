package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        //create observable farm
        Farm farm = new Farm();
        
        //create observers
        DayEvents dayEvents = new DayEvents();
        NightEvents nightEvents = new NightEvents();
        
        //add observers
        farm.addObserver(dayEvents);
        farm.addObserver(nightEvents);       
        
        //Add 3 initial farmers
        farm.addFarmer(new Farmer(farm));
        farm.addFarmer(new Farmer(farm));
        farm.addFarmer(new Farmer(farm));
        
        //Add 3 initial resources
        farm.addResource(ResourceGenerator.generateResource());
        farm.addResource(ResourceGenerator.generateResource());
        farm.addResource(ResourceGenerator.generateResource());
        
        
        //start simulation loop
        while(farm.upgrade() != true && farm.bankrupt()!= true) {
            System.out.println("=====================");
            System.out.println("Day: " + farm.getDay() + " Daytime");
            
            //start day events
            farm.setTime(true);
            
            System.out.println("=====================");
            System.out.println("Day: " + farm.getDay() + " Nighttime");
            
            
            //start night events
            farm.setTime(false);
            
            
            
            System.out.println("The farm has " + farm.getDollars() + " dollars after the day's events"); 
        }
        
        

        


    }

}
