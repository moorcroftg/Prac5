package com.MoorcroftG.Prac5;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/03/31.
 */
public class ConcatTest extends TestCase {
    @Test
    public void testConcatMethod() throws Exception {
        String result;
        Concat c = new Concat ("Hello", "There");
        result = c.concatMethod();
        assertEquals("Something's not right","Something Else", result);
    }

}