package com.MoorcroftG.Prac5;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 */
public class AppTest extends TestCase {
    @Test
    public void testMain() throws Exception {
        Context context = new Context(new Cat());
        assertNotNull("This should work", context);
    }

}