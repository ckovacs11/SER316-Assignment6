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
            return decHorse;
            
        case 1:
            Resource new_sheep = animalFactory.getResource("sheep");
            Resource decSheep = new SheepDecorator(new_sheep);
            return decSheep;
        case 2:
            Resource new_cow = animalFactory.getResource("cow");
            return new_cow;
        case 3:
            Resource new_corn = cropFactory.getResource("corn");
            Resource decCorn = new CornDecorator(new_corn);
            return decCorn;
        case 4:
            Resource new_wheat = cropFactory.getResource("wheat");
            return new_wheat;
            
        }
        return null;
        
    }

}
