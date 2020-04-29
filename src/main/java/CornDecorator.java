package main.java;

import java.util.Random;

public class CornDecorator extends ResourceDecorator {
    
    String attribute;
    
    public CornDecorator(Resource decRes) {
        super(decRes);
        
        Random rand = new Random();
        int randInt = rand.nextInt(3);
        
        switch (randInt) {
        
            case 0:
                this.attribute = "average";
                break;
            case 1:
                this.attribute = "dent";
                break;
            case 2:
                this.attribute = "sweet";
                break;
            default:
                break;
        }
    }
    
    
    @Override
    public int generateIncome() {
        
        //TODO RNG for sweet or dent corn
        if (this.attribute.equalsIgnoreCase("average")) {
            return decRes.generateIncome();
        } else if (this.attribute.equalsIgnoreCase("dent")) {
            System.out.println("Farmers have harvested ears of dent corn for 60 dollars of income");
            return 60;
        } else {
            System.out.println("Farmers have harvested ears of sweet corn for 100 "
                    + "dollars of income");
            return 100;
        }
    }
    
    @Override
    public String getAttribute() {
        return this.attribute;
    }

}
