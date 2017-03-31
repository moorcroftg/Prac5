package com.MoorcroftG.Prac5;

/**
 * Abstract Factory
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractFactory animalFactory = FactoryProducer.getFactory("Animal");
        Animal cat = animalFactory.getAnimal("Cat");
        cat.run();

        Animal dog = animalFactory.getAnimal("Dog");
        dog.run();

        AbstractFactory foodFactory = FactoryProducer.getFactory("Food");
        Food fish = foodFactory.getFood("Fish");
        fish.eat();

        Food rabbit = foodFactory.getFood("Rabbit");
        rabbit.eat();
    }
}
