package test.java;

import static org.junit.Assert.*;


import org.junit.Test;

import main.java.NightEvents;
import main.java.Farm;

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
        testFarm.setTime(true);
        
        assertTrue(testFarm.getTime());
    }

}