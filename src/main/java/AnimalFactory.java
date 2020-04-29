package main.java;

//A factory for creating different animals
public class AnimalFactory extends AbstractFactory {
    
    public Resource getResource(String s) {
        if (s.equalsIgnoreCase("HORSE")) {
            return new Horse();
        } else if (s.equalsIgnoreCase("SHEEP")) {
            return new Sheep();
        } else if (s.equalsIgnoreCase("COW")) {
            return new Cow();
        } 
        
        return null;
    }

}
