package com.MoorcroftG.Prac5;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnimalCache.fillCache();

        Animal animalClone1 = (Animal) AnimalCache.getAnimal("1");
        System.out.println(animalClone1.getName());

        Animal animalClone2 = (Animal) AnimalCache.getAnimal("2");
        System.out.println(animalClone2.getName());
    }
}
