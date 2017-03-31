package com.MoorcroftG.Prac5;

/**
 *
 */
public class Cat implements Animals {

    public void accept(AnimalVisitor animalVisitor)
    {
        animalVisitor.visit(this);
    }
}
