package main.java;

import java.util.Random;

public class SheepDecorator extends ResourceDecorator {
    
    String attribute;
    
    public SheepDecorator(Resource decRes) {
        super(decRes);
        
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        
        switch (randInt) {
            case 0:
                this.attribute = "average";
                break;
            case 1:
                this.attribute = "small";
                break;
            case 2:
                this.attribute = "large";
                break;
            default:
                break;
        }
    }
    
    @Override
    public int generateIncome() {
        
        //TODO RNG for large or small sheep
        if (this.attribute.equalsIgnoreCase("average")) {
            return decRes.generateIncome();
        } else if (this.attribute.equalsIgnoreCase("small")) {
            System.out.println("Farmers have sheered a small sheep for 40 dollars of income");
            return 40;
        } else {
            System.out.println("Farmers have sheered a large sheep for 60 dollars of income");
            return 60;
        }
    }
    
    @Override
    public String getAttribute() {
        return this.attribute;
    }

}
