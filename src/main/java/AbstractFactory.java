package main.java;

//All factories must be able to get the resource
public abstract class AbstractFactory {
    
    abstract Resource getResource(String resourceType);

}
