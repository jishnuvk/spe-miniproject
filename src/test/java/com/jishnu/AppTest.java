package com.jishnu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{   

    private static double err = 1e-10;
    App calc = new App();

    @Test
    public void squareRootTrue(){
        assertEquals("squareroot of 9", 3.0, calc.squareRoot(9), err);
        assertTrue("sqaureroot of -1", Double.isNaN(calc.squareRoot(-1)));
    }

    @Test
    public void squareRootFalse(){
        assertNotEquals("squareroot of 9", -3.0, calc.squareRoot(9), err);
    }
}
