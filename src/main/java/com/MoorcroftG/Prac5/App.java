package com.MoorcroftG.Prac5;

/**
 * Chain of Responsibility
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnimalHandler chainList = chain();

        chainList.handleRequest(AnimalE.Cat);
        chainList.handleRequest(AnimalE.Dog);
        chainList.handleRequest(AnimalE.Bird);
        chainList.handleRequest(AnimalE.Horse);
    }

    public static AnimalHandler chain()
    {
        AnimalHandler cat = new CatHandler();
        AnimalHandler dog = new DogHandler();
        AnimalHandler mouse = new MouseHandler();
        AnimalHandler bird = new BirdHandler();

        cat.setInheritor(dog);
        dog.setInheritor(mouse);
        mouse.setInheritor(bird);

        return cat;
    }
}
