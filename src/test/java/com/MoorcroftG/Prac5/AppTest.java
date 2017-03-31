package com.MoorcroftG.Prac5;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @Test
    public void testMain() throws Exception {
        AbstractFactory animalFactory = FactoryProducer.getFactory("Animal");
        Animal cat = animalFactory.getAnimal("Cat");

        assertNotNull("This object shouldn't be null", cat);
    }

}
