package test.java;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import main.java.AnimalFactory;
import main.java.CropFactory;
import main.java.FactoryProducer;
import main.java.Farm;
import main.java.Resource;
import org.junit.Test;

public class GenerateIncomeTest {
    
    private Farm farm;
    private ArrayList<Resource> resources;
    
    @org.junit.Before
    public void setUp() throws Exception {
        farm = new Farm();
        AnimalFactory animalFactory = (AnimalFactory) FactoryProducer.getFactory(true);
        CropFactory cropFactory = (CropFactory) FactoryProducer.getFactory(false);
        Resource newHorse = animalFactory.getResource("horse");
        Resource newCow = animalFactory.getResource("cow");
        Resource newSheep = animalFactory.getResource("sheep");
        Resource newCorn = cropFactory.getResource("corn");
        Resource newWheat = cropFactory.getResource("wheat");
        farm.addResource(newHorse);
        farm.addResource(newCow);
        farm.addResource(newSheep);
        farm.addResource(newCorn);
        farm.addResource(newWheat);
        
        
        
    }

    @Test
    public void testGenerateIncome() {
        resources = farm.getResources();
        for (int i = 0; i < 4; i++) {
            for (Resource rec :  resources) {
                farm.income(rec.generateIncome());
            }            
        }        
        assertEquals(1171, farm.getDollars());
        
    }

}
