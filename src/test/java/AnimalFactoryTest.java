package test.java;

import static org.junit.Assert.assertNotNull;

import main.java.AnimalFactory;
import main.java.FactoryProducer;
import main.java.Resource;
import org.junit.Test;





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
