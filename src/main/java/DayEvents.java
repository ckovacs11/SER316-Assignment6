package main.java;

import java.util.Observer;
import java.util.Observable;

public class DayEvents implements Observer {
    
    private Farm farmUpdate;
    
    
    @Override
    public void update(Observable farm, Object arg) {
        this.farmUpdate = (Farm) farm;
        
        //TODO Daytime events
        
        
        
        
        
    }
    


}
