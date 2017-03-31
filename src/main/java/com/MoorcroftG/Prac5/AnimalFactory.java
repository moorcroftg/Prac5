package com.MoorcroftG.Prac5;

/**
 *
 */
public class AnimalFactory extends AbstractFactory
{
        public Animal getAnimal (String animalType)
        {
            if (animalType == null)
            {
                return null;
            }

            if (animalType.equals("Cat"))
            {
                return new Cat();
            }
            else if (animalType.equals("Dog"))
            {
                return new Dog();
            }
            return null;
        }

        Food getFood (String food)
        {
            return null;
        }

}
