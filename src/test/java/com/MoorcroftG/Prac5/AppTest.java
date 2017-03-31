package com.MoorcroftG.Prac5;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 */
public class AppTest extends TestCase {
    @Test
    public void testMain() throws Exception {
        AnimalHandler cat = new CatHandler();
        assertNotNull("This should be fine", cat);
    }

}