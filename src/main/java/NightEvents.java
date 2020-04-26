package main.java;

import java.util.Observer;
import java.util.Observable;

public class NightEvents implements Observer {
    
    private Farm farmUpdate;
    
    
    @Override
    public void update(Observable farm, Object arg) {
        this.farmUpdate = (Farm) farm;
        
        //TODO Night time events
        
        
        
        
        
    }
}
