package main.java;

import java.util.Random;

public class HorseDecorator extends ResourceDecorator {
    
    public String attribute;
    
    public HorseDecorator(Resource decRes) {
        super(decRes);
        
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        
        switch (randInt) {
            case 0:
                this.attribute = "average";
                break;
            case 1:
                this.attribute = "slow";
                break;
            case 2:
                this.attribute = "fast";
                break;
            default:
                break;
        }
    }
    
    @Override
    public int generateIncome() {
              
        if (decRes.generateIncome() == 1) {
   
            if (this.attribute.equalsIgnoreCase("average")) {
                                
                System.out.println("The farm's average horse generated 150 in income "
                            + "from a horse race.");
                return 150;
            } else if (this.attribute.equalsIgnoreCase("slow")) {
                
                System.out.println("The farm's slow horse generated a measly 120 dollars in income "
                            + "from a horse race.");                       
                return 120;            
            
            } else {                     
                System.out.println("The farm's fast horse generated 180 dollars in "
                            + "income by winning a horse race!");    
                return 180; 
            }
        } else {                          
            System.out.println("One of the farm's horses is resting in preperation "
                        + "for the next race.");
            return 0;
        }
    }
    
    @Override
    public String getAttribute() {
        return this.attribute;
    }

}
