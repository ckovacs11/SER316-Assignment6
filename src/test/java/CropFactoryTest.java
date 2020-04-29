package test.java;

import static org.junit.Assert.assertNotNull;

import main.java.CropFactory;
import main.java.FactoryProducer;
import main.java.Resource;
import org.junit.Test;



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