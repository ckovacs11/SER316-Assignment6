package main.java;

import java.util.Observable;
import java.util.ArrayList;


public class Farm extends Observable {
    
    ArrayList<Resource> resources;
    ArrayList<Farmer> farmers;
    private int dollars;
    private boolean daytime;
    private int timeCount;
    private boolean bankrupt;
    private boolean upgraded;
    private static int upgradeCost = 1000;
    
    
    
    public Farm() {
        
        this.dollars = 0;
        this.daytime = true;
        this.timeCount = 0;
        this.bankrupt = false;
        this.upgraded = false;
        this.farmers = new ArrayList<Farmer>();
        this.resources = new ArrayList<Resource>();
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
        this.timeCount++;
    }
    
    public int getDollars() {
        return this.dollars;
    }
    
    public void setDollars(int dollars) {
        this.dollars = dollars;
    }
    
    public void income(int i) {
        this.dollars += this.dollars + i;
    }
    
    public boolean bankrupt() {
        if(dollars <= 0) {
            this.bankrupt = true;            
        }
        
        return bankrupt;
        
    }
    
    public boolean upgrade() {
        if(dollars >= 1200) {
            this.upgraded = true;
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
    
    
    

}
