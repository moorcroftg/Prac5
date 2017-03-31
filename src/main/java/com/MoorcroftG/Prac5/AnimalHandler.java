package com.MoorcroftG.Prac5;

/**
 *
 */
public abstract class AnimalHandler {
    AnimalHandler inheritor;

    public void setInheritor(AnimalHandler inh)
    {
        inheritor = inh;
    }

    public abstract void handleRequest(AnimalE request);
}
