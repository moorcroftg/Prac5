package com.MoorcroftG.Prac5;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by enusa on 2017/03/31.
 */
public class AppTest extends TestCase {
    @Test
    public void testMain() throws Exception {
        AnimalCache.fillCache();

        Animal animalClone1 = (Animal) AnimalCache.getAnimal("1");
        assertEquals("This should fail", "Something", animalClone1.getName());
    }

}