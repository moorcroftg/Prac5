package com.MoorcroftG.Prac5;

/**
 * Visitor
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animals an = new Collection();
        an.accept(new AnimalDisplay());
    }
}
