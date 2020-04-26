package main.java;

import java.util.Random;

public class SheepDecorator extends ResourceDecorator {
    
    String attribute;
    
    public SheepDecorator(Resource decRes) {
        super(decRes);
        
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        
        switch(randInt) {
        case 0:
            this.attribute = "average";
        case 1:
            this.attribute = "small";
        case 2:
            this.attribute = "large";
        }
    }
    
    @Override
    public int generateIncome() {
        
        //TODO RNG for large or small sheep
        if(this.attribute.equalsIgnoreCase("average")){
            return decRes.generateIncome();
        } else if(this.attribute.equalsIgnoreCase("small")) {
            return decRes.generateIncome() - 10;
        } else {
            return decRes.generateIncome() + 10;
        }
    }

}
