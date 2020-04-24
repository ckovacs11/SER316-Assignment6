package main.java;

//This class creates new animal and crop factories. 
public class FactoryProducer {
    
    //Static so that FactoryProducer does not have to be instantiated
    public static AbstractFactory getFactory(boolean animal) {
        
        if(animal) {
            return new AnimalFactory();
        } else {
            return new CropFactory();
        }
        
    }

}
