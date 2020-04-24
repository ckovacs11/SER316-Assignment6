package main.java;

public class CornDecorator extends ResourceDecorator {
    
    public CornDecorator(Resource decRes) {
        super(decRes);
    }
    
    
    @Override
    public void generateIncome() {
        
        //TODO RNG for sweet or dent corn
        decRes.generateIncome();
    }

}
