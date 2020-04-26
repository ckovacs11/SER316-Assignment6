package main.java;

import java.util.Random;

public class CornDecorator extends ResourceDecorator {
    
    String attribute;
    
    public CornDecorator(Resource decRes) {
        super(decRes);
        
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        
        switch(randInt) {
        case 0:
            this.attribute = "average";
        case 1:
            this.attribute = "dent";
        case 2:
            this.attribute = "sweet";
        }
    }
    
    
    @Override
    public int generateIncome() {
        
        //TODO RNG for sweet or dent corn
        if(this.attribute.equalsIgnoreCase("average")){
            return decRes.generateIncome();
        } else if(this.attribute.equalsIgnoreCase("dent")) {
            return decRes.generateIncome() - 20;
        } else {
            return decRes.generateIncome() + 20;
        }
    }

}
