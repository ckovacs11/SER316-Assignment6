package test.java;

import static org.junit.Assert.assertTrue;

import main.java.DayEvents;
import main.java.Farm;
import org.junit.Test;



public class DayEventsTest {
    
    private Farm testFarm;
    private DayEvents eventTest;
    
    
    
    @org.junit.Before
    public void setUp() throws Exception {
        testFarm = new Farm();
        eventTest = new DayEvents();
        testFarm.addObserver(eventTest);
        
        
    }

    @Test
    public void testUpdate() {
        testFarm.setTime(true);
        
        assertTrue(testFarm.getTime());
    }

}
