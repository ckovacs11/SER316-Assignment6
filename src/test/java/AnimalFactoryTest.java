package test.java;

import static org.junit.Assert.*;


import org.junit.Test;

import main.java.AbstractFactory;
import main.java.FactoryProducer;
import main.java.Resource;
import main.java.AnimalFactory;


public class AnimalFactoryTest {

    Resource testResource;
    AnimalFactory factory;
    
    
    
    @org.junit.Before
    public void setUp() throws Exception {
        testResource = null;
        factory = (AnimalFactory) FactoryProducer.getFactory(true);
        
    }  
    
    
    
    @Test
    public void testGetResource() {
        testResource = factory.getResource("Cow");
        assertNotNull(testResource);
    }

}
