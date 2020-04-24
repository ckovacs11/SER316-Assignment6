package main.java;

public abstract class ResourceDecorator implements Resource {
    
    protected Resource decRes;
    
    public ResourceDecorator(Resource r) {
        this.decRes = r;
    }
    
    public void generateIncome() {
        decRes.generateIncome();
    }
    

}
