package com.MoorcroftG.Prac5;

/**
 *
 */
public class FoodFactory extends AbstractFactory{
    public Food getFood (String foodType)
    {
        if (foodType == null)
        {
            return null;
        }

        if (foodType.equals("Fish"))
        {
            return new Fish();
        }
        else if (foodType.equals("Rabbit"))
        {
            return new Rabbit();
        }
        return null;
    }

    Animal getAnimal (String animal)
    {
        return null;
    }
}
