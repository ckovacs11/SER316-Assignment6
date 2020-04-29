package test.java;

import static org.junit.Assert.assertFalse;

import main.java.Farm;
import main.java.NightEvents;
import org.junit.Test;

public class NightEventsTest {
    
    private Farm testFarm;
    private NightEvents eventTest;
    
    
    
    @org.junit.Before
    public void setUp() throws Exception {
        testFarm = new Farm();
        eventTest = new NightEvents();
        testFarm.addObserver(eventTest);
        
        
    }

    @Test
    public void testUpdate() {
        testFarm.setTime(false);
        
        assertFalse(testFarm.getTime());
    }

}