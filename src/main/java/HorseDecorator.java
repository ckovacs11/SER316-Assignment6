package main.java;

import java.util.Random;

public class HorseDecorator extends ResourceDecorator {
    
    String attribute;
    
    public HorseDecorator(Resource decRes) {
        super(decRes);
        
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        
        switch(randInt) {
        case 0:
            this.attribute = "average";
        case 1:
            this.attribute = "slow";
        case 2:
            this.attribute = "fast";
        }
    }
    
    @Override
    public int generateIncome() {
        
        //TODO RNG for fast or slow horse
        if(this.attribute.equalsIgnoreCase("average")){
            return decRes.generateIncome();
        } else if(this.attribute.equalsIgnoreCase("slow")) {
            return decRes.generateIncome() - 30;
        } else {
            return decRes.generateIncome() + 30;
        }
    }

}
