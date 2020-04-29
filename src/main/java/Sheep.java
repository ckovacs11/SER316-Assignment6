package main.java;

public class Sheep implements Resource {
    
    /**
     * 
     * @return Int
     */
    public int generateIncome() {
              
        System.out.println("Farmers have sheered a sheep and generated 50 dollars in income");
        return 50;       
    }
    
    public String getAttribute() {
        return "";
    }

}
