package com.MoorcroftG.Prac5;

/**
 *
 */
public interface AnimalVisitor {
    public void visit(Cat cat);
    public void visit(Dog dog);
    public void visit(Mouse mouse);
    public void visit(Collection collection);
}
