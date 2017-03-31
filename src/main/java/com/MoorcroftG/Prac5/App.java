package com.MoorcroftG.Prac5;

/**
 * Adapter
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal dog = new DogAdapter(new Dog());

        lion.roar();
        tiger.roar();
        dog.roar();

    }
}
