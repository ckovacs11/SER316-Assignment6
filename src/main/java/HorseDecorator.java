package main.java;

public class HorseDecorator extends ResourceDecorator {
    
    public HorseDecorator(Resource decRes) {
        super(decRes);
    }
    
    @Override
    public void generateIncome() {
        
        //TODO RNG for fast or slow horse
        decRes.generateIncome();
    }

}
