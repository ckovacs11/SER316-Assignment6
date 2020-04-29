package main.java;

public abstract class ResourceDecorator implements Resource {
    
    protected Resource decRes;
    protected String attribute;
    
    public ResourceDecorator(Resource r) {
        this.decRes = r;
        this.attribute = "";
    }
    
    public int generateIncome() {
        return decRes.generateIncome();
    }
    
    public String getAttribute() {
        return decRes.getAttribute();
    }
    

}
