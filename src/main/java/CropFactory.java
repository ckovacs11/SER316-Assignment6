package main.java;

//A factory for creating different crops
public class CropFactory extends AbstractFactory {
    
    public Resource getResource(String s) {
        if (s.equalsIgnoreCase("CORN")) {
            return new Corn();
        } else if (s.equalsIgnoreCase("WHEAT")) {
            return new Wheat();
        }
        
        return null;
    }

}
