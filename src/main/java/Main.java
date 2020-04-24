package main.java;

public class Main {

    public static void main(String[] args) {
        
        //create observable farm
        Farm farm = new Farm();
        
        //create observers
        DayEvents dayEvents = new DayEvents();
        NightEvents nightEvents = new NightEvents();
        
        
        AbstractFactory animalFactory = FactoryProducer.getFactory(true);
        AbstractFactory cropFactory = FactoryProducer.getFactory(false);
        
        Resource cow = animalFactory.getResource("cow");
        Resource corn = cropFactory.getResource("corn");
        
        cow.generateIncome();
        corn.generateIncome();

    }

}
