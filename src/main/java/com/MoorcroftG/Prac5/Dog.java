package com.MoorcroftG.Prac5;

/**
 * Created by enusa on 2017/03/31.
 */
public class Dog extends Animal {
    public Dog ()
    {
        name = "Tyson";
    }

    @Override
    public void sleep()
    {
        System.out.println("Tyson is sleeping");
    }
}
