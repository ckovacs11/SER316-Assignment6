package main.java;

import java.util.Observable;


public class Farm extends Observable {
    
    private int dollars;
    private boolean daytime;
    
    
    public Farm() {
        
        this.dollars = 0;
        this.daytime = true;
        
    }
    
    boolean getTime() {
        return this.daytime;
    }
    
    
    //set the time of day and notify observers (DayEvents and NightEvents)
    void setTime(boolean daytime) {
        this.daytime = daytime;
        setChanged();
        notifyObservers();
    }
    
    int getDollars() {
        return this.dollars;
    }
    
    void setDollars(int dollars) {
        this.dollars = dollars;
    }
    
    void income(int i) {
        this.dollars += this.dollars + i;
    }
    
    

}
