package test.java;

import static org.junit.Assert.*;


import org.junit.Test;

import main.java.AbstractFactory;
import main.java.FactoryProducer;
import main.java.Resource;
import main.java.CropFactory;


public class CropFactoryTest {

    Resource testResource;
    CropFactory factory;
    
    
    
    @org.junit.Before
    public void setUp() throws Exception {
        testResource = null;
        factory = (CropFactory) FactoryProducer.getFactory(false);
        
    }  
    
    
    
    @Test
    public void testGetResource() {
        testResource = factory.getResource("corn");
        assertNotNull(testResource);
    }

}