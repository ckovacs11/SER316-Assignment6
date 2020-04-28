package main.java;

public class Cow implements Resource {
    
    public int generateIncome() {
        
        System.out.println("Farmers milked a cow for 100 dollars in income");
        return 100;
        
    }
    
    public String getAttribute() {
        return "";
    }

}
