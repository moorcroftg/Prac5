package com.MoorcroftG.Prac5;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by enusa on 2017/03/31.
 */
public class AppTest extends TestCase {
    @Test
    public void testMain() throws Exception {
        Animal dog = new DogAdapter(new Dog());

        assertNotNull("This shouldn't be a problem" ,dog);
    }

}