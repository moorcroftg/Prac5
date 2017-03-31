package com.MoorcroftG.Prac5;

/**
 *
 */
public class AnimalDisplay implements AnimalVisitor {

    public void visit(Collection collection)
    {
        System.out.println("Diplaying collectoin of animals");
    }

    public void visit(Cat cat)
    {
        System.out.println("This is a cat.");
        System.out.println("Cat goes meow.");
    }

    public void visit(Dog dog)
    {
        System.out.println("This is a dog.");
        System.out.println("Dog goes Ed...ward...");
    }

    public void visit(Mouse mouse)
    {
        System.out.println("This is a mouse.");
        System.out.println("Mouse goes squeak.");
    }
}
