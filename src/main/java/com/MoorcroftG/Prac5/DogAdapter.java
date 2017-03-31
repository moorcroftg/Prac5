package com.MoorcroftG.Prac5;

/**
 * Created by enusa on 2017/03/31.
 */
public class DogAdapter implements Animal{
    Dog dog = new Dog();

    DogAdapter(Dog d)
    {
        dog = d;
    }

    public void roar() {
        dog.makeNoise();
    }
}
