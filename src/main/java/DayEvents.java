package main.java;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class DayEvents implements Observer {
    
    private Farm farmUpdate;
    
    
    @Override
    public void update(Observable farm, Object arg) {
        this.farmUpdate = (Farm) farm;
        
        if (farmUpdate.getTime() == true) {                    
            ArrayList<Resource> resources = (ArrayList<Resource>) farmUpdate.getResources();
        
            for (Resource r :  resources) {
                farmUpdate.income(r.generateIncome());
            }
        
            ArrayList<Farmer> farmers = (ArrayList<Farmer>) farmUpdate.getFarmers();
        
            for (Farmer f : farmers) {
                farmUpdate.addFarmerBonus(f.work());
            }
  
        }   
    }
    


}
