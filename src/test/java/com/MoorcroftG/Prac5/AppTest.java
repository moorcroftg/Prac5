package com.MoorcroftG.Prac5;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by enusa on 2017/03/31.
 */
public class AppTest extends TestCase {
    @Test
    public void testMain() throws Exception {
        Proxy p = new Proxy("Grey", "Medium", true);
        assertNotNull("This shouldn't fail", p);
    }

}