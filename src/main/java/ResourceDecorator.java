package main.java;

public abstract class ResourceDecorator implements Resource {
    
    protected Resource decRes;
    
    public ResourceDecorator(Resource r) {
        this.decRes = r;
    }
    
    public int generateIncome() {
        return decRes.generateIncome();
    }
    

}
