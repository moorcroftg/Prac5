package com.MoorcroftG.Prac5;

/**
 *
 */
public class Proxy{
    private String colour;
    private String height;
    private boolean howl;
    Wolf wolf;

    public Proxy (String cl, String ht, boolean hl)
    {
        colour = cl;
        height = ht;
        howl = hl;
    }

    public void wolfDescription(){
        if (wolf == null)
        {
            wolf = new Wolf(colour, height, howl);
        }
        wolf.wolfDescription();
    }

}
