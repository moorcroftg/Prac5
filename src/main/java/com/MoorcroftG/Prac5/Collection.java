package com.MoorcroftG.Prac5;

/**
 * Created by enusa on 2017/03/31.
 */
public class Collection implements Animals {
    Animals[] a;

    public Collection()
    {
        a = new Animals[]
                {
                        new Cat(), new Dog(), new Mouse()
                };

    }

    public void accept(AnimalVisitor animalVisitor)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i].accept(animalVisitor);
        }
        animalVisitor.visit(this);
    }
}
