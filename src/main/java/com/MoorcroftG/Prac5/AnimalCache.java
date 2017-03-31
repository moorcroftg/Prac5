package com.MoorcroftG.Prac5;

import java.util.Hashtable;

/**
 *
 */
public class AnimalCache {
    private static Hashtable<String, Animal> animalMap = new Hashtable<String, Animal>();

    public static Animal getAnimal(String animalId)
    {
        Animal cachedAnimal = animalMap.get(animalId);
        return (Animal) cachedAnimal.cloneMethod();
    }

    public static void fillCache()
    {
        Cat c = new Cat();
        c.setId("1");
        animalMap.put(c.getId(), c);

        Dog d = new Dog();
        d.setId("2");
        animalMap.put(d.getId(), d);
    }
}
