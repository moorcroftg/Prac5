package com.MoorcroftG.Prac5;

/**
 *
 */
public class Dog implements Animals {

    public void accept(AnimalVisitor animalVisitor)
    {
        animalVisitor.visit(this);
    }
}
