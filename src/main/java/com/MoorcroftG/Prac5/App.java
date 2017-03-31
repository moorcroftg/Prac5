package com.MoorcroftG.Prac5;

/**
 *  Singleton
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Concat c = new Concat ("One", "word!");
        System.out.println(c.concatMethod());

    }
}
