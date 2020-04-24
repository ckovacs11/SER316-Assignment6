package main.java;

public class SheepDecorator extends ResourceDecorator {
    
    public SheepDecorator(Resource decRes) {
        super(decRes);
    }
    
    @Override
    public void generateIncome() {
        
        //TODO RNG for large or small sheep
        decRes.generateIncome();
    }

}
