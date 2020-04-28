package main.java;

public class Horse implements Resource {
    
    int count;
    
    
    public Horse() {
        count = 0;
    }
    
    //returns 1 if the resource is able to generate income
    public int generateIncome() {
        
       if(count == 0) {
           count++;
           return 1;
           
       } else if(count > 0 && count < 3){
           count++;
           return 0;
       
       } else {
           count = 0;
           return 0;
       }
        
    }
    
    public String getAttribute() {
        return "";
    }

}
