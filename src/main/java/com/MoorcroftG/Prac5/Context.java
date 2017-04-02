package com.MoorcroftG.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class Context {
    private Animals animals;

    public Context(Animals a)
    {
        animals = a;
    }

    public String makeANoise()
    {
        return animals.makeNoise();
    }
}
