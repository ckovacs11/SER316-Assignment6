package main.java;

import java.util.ArrayList;
import java.util.Observable;



public class Farm extends Observable {
    
    ArrayList<Resource> resources;
    ArrayList<Farmer> farmers;
    private int dollars;
    private boolean daytime;
    private boolean bankrupt;
    private boolean upgraded;
    private boolean weevilProtection;
    private int farmerBonus;
    private int day;
    
    
    
    public Farm() {
        
        this.dollars = 50;
        this.daytime = true;
        this.bankrupt = false;
        this.upgraded = false;
        this.farmers = new ArrayList<Farmer>();
        this.resources = new ArrayList<Resource>();
        this.weevilProtection = false;
        this.farmerBonus = 0;
        this.day = 1;
        
        System.out.println("A new farm has been created.");
        
    }
    
    public boolean getTime() {
        return this.daytime;
    }
    
    
    //set the time of day and notify observers (DayEvents and NightEvents)
    public void setTime(boolean daytime) {
        this.daytime = daytime;
        setChanged();
        notifyObservers();
        
    }
    
    public int getDollars() {
        return this.dollars;
    }
    
    public void setDollars(int dollars) {
        this.dollars = dollars;
    }
    
    public void income(int i) {
        this.dollars += i;
        
    }
    
    public boolean bankrupt() {
        if (dollars <= 0) {
            this.bankrupt = true;  
            System.out.println("Your farm has gone bankrupt!");
        }
        
        return bankrupt;
        
    }
    
    public boolean upgrade() {
        if (dollars >= 1500) {
            this.upgraded = true;
            System.out.println("Your farm has been upgraded!");
        }
        
        return upgraded;
        
    }
    
    public void addResource(Resource r) {
        resources.add(r);
    }
    
    public ArrayList getResources() {
        return resources;
    }
    
    public void addFarmer(Farmer f) {
        farmers.add(f);
    }
    
    public ArrayList getFarmers() {
        return farmers;
    }
    
    public int getFarmerBonus() {
        return this.farmerBonus;
    }
    
    public void addFarmerBonus(int i) {
        if (i != -1) {
            this.farmerBonus += i;
        
        } else {            
            this.weevilProtection = true; 
        }
        
        
    }
    
    public void farmerIncome() {
        this.dollars += this.farmerBonus;
    }
    
    public String getPhase() {
        if (this.daytime == true) {
            return "Daytime";
        } else {
            return "Nighttime";
        }
    }
    
    public int getDay() {
        return this.day;
    }
    
    public void incrementDay() {
        this.day++;
    }
    
    public boolean getWeevilProtection() {
        return this.weevilProtection;
    }
    
    public void lostIncome(int i) {
        this.dollars -= i;
    }
    

}
