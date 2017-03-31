package com.MoorcroftG.Prac5;

/**
 *
 */
public class Wolf {
    private String colour;
    private String height;
    private boolean howl;

    protected Wolf (String cl, String ht, boolean hl)
    {
        colour = cl;
        height = ht;
        howl = hl;
    }

    protected void wolfDescription ()
    {
        System.out.println ("Colour: " + colour + "\nHeight: " + height + "\nDoes it howl? " + howl);
    }
}
