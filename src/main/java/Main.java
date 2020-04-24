package main.java;

public class Main {

    public static void main(String[] args) {
        
        AbstractFactory animalFactory = FactoryProducer.getFactory(true);
        AbstractFactory cropFactory = FactoryProducer.getFactory(false);
        
        Resource cow = animalFactory.getResource("cow");
        Resource corn = cropFactory.getResource("corn");
        
        cow.generateIncome();
        corn.generateIncome();

    }

}
