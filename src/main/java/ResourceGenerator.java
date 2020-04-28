package main.java;

import java.util.Random;

public class ResourceGenerator {
    
    
    
    
    public static Resource generateResource() {
        
        AbstractFactory animalFactory = FactoryProducer.getFactory(true);
        AbstractFactory cropFactory = FactoryProducer.getFactory(false);
        
        
        Random rand = new Random();
        int randInt = rand.nextInt(5);
        
        switch(randInt) {
        case 0:
            Resource new_horse = animalFactory.getResource("horse");
            Resource decHorse = new HorseDecorator(new_horse);
            System.out.println("The farm has acquired a " + decHorse.getAttribute() + " horse");
            return decHorse;
            
        case 1:
            Resource new_sheep = animalFactory.getResource("sheep");
            Resource decSheep = new SheepDecorator(new_sheep);
            System.out.println("The farm has acquired a " + decSheep.getAttribute() + " sheep");
            return decSheep;
        case 2:
            Resource new_cow = animalFactory.getResource("cow");
            System.out.println("The farm has acquired a cow");
            return new_cow;
        case 3:
            Resource new_corn = cropFactory.getResource("corn");
            Resource decCorn = new CornDecorator(new_corn);
            System.out.println("The farm has acquired " + decCorn.getAttribute() + " corn");
            return decCorn;
        case 4:
            Resource new_wheat = cropFactory.getResource("wheat");
            System.out.println("The farm has acquired wheat");
            return new_wheat;
            
        }
        return null;
        
    }

}
