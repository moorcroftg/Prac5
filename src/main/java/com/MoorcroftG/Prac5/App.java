package com.MoorcroftG.Prac5;

/**
 * Visitor
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Context context = new Context(new Cat());
        System.out.println(context.makeANoise());

        context = new Context(new Dog());
        System.out.println(context.makeANoise());

        context = new Context((new Mouse()));
        System.out.println(context.makeANoise());
    }
}
