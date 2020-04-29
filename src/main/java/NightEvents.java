package main.java;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;


public class NightEvents implements Observer {
    
    private Farm farmUpdate;
    
    @SuppressWarnings("unchecked")
    @Override
    public void update(Observable farm, Object arg) {
        
        
        this.farmUpdate = (Farm) farm;
        
        if (farmUpdate.getTime() == false) {
            boolean hasCow = false;
            boolean hasCrop = false;
            Random rand = new Random();
            int randInt = rand.nextInt(9);
            
            switch (randInt) {
                case 0:                
                    for (int i = 0; i < farmUpdate.getResources().size(); i++) {
                        if (farmUpdate.getResources().get(i).getClass() == Wheat.class 
                            || 
                            farmUpdate.getResources().get(i).getClass() == CornDecorator.class 
                            || 
                            farmUpdate.getResources().get(i).getClass() == Corn.class) {
                            hasCrop = true;
                        }
                    }
                    if (hasCrop == true) {
                        System.out.println("Weevils try to eat your crops!");
                        if (farmUpdate.getWeevilProtection()) {
                            System.out.println("Your crops were protected by your "
                                    + "weevil-destroying farmer!");
                        } else {
                            System.out.println("Some of your crops were eaten by the weevils! "
                                    + "Your farm lost 400 dollars.");
                            farmUpdate.lostIncome(400);
                        }
                    }
                    break;
                case 1:                
                    for (int i = 0; i < farmUpdate.getResources().size(); i++) {
                        if (farmUpdate.getResources().get(i).getClass() == Cow.class) {
                            hasCow = true;
                        }
                    }
                    if (hasCow == true) {
                        System.out.println("Wolves have eaten a cow! Your farm spends "
                                + "280 dollars to replace it.");
                        farmUpdate.lostIncome(280);
                    }
                    break;
                case 2:
                    System.out.println("Thieves break into the farm and "
                            + "steal some of your fertilizer and feed. "
                            + "Your farm lost 100 dollars.");
                    farmUpdate.lostIncome(100);
                    break;
                default:
                    break;
            }
            
        
            if (hasCrop || hasCow) {
                System.out.println("Your farm tries to recover from the "
                        + "tumultuous events of the night...");
            }
        
        
        
        
            farmUpdate.incrementDay();
        }
    }
}
