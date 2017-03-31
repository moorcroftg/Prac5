package com.MoorcroftG.Prac5;

/**
 * Created by enusa on 2017/03/31.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String option)
    {
        if (option.equals("Animal"))
        {
            return new AnimalFactory();
        }
        else if (option.equals("Food"))
        {
            return new FoodFactory();
        }
        return null;
    }
}
