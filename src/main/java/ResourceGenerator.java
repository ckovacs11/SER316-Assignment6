package main.java;

import java.util.Random;

public class ResourceGenerator {
    
    
    
    /** Generates an animal or crop resource.
     * 
     * @return Resource
     */
    public static Resource generateResource() {
        
        AbstractFactory animalFactory = FactoryProducer.getFactory(true);
        AbstractFactory cropFactory = FactoryProducer.getFactory(false);
        
        
        Random rand = new Random();
        int randInt = rand.nextInt(5);
        
        switch (randInt) {
            case 0:
                Resource newHorse = animalFactory.getResource("horse");
                Resource decHorse = new HorseDecorator(newHorse);
                System.out.println("The farm has acquired a " + decHorse.getAttribute() + " horse");
                return decHorse;
            
            case 1:
                Resource newSheep = animalFactory.getResource("sheep");
                Resource decSheep = new SheepDecorator(newSheep);
                System.out.println("The farm has acquired a " + decSheep.getAttribute() + " sheep");
                return decSheep;
            case 2:
                Resource newCow = animalFactory.getResource("cow");
                System.out.println("The farm has acquired a cow");
                return newCow;
            case 3:
                Resource newCorn = cropFactory.getResource("corn");
                Resource decCorn = new CornDecorator(newCorn);
                System.out.println("The farm has acquired " + decCorn.getAttribute() + " corn");
                return decCorn;
            case 4:
                Resource newWheat = cropFactory.getResource("wheat");
                System.out.println("The farm has acquired wheat");
                return newWheat;
            default:
                break;
            
        }
        return null;
        
    }

}
