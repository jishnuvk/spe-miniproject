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

    @Test
    public void powerTrue(){
        assertEquals("3 raised to 3", 27.0, calc.power(3,3), err);
        assertEquals("9 raised to 0", 1, calc.power(9,0), err);
    }

    @Test
    public void powerFalse(){
        assertNotEquals("3 raised to -3", 27.0, calc.power(3,-3), err);
    }

    @Test
    public void logarithmTrue(){
        assertEquals("log of e", 1, calc.logarithm(Math.E), err);
        assertTrue("log of negative number", Double.isNaN(calc.logarithm(-1)));
    }

    @Test
    public void logarithmFalse(){
        assertNotEquals("log of 10", 1, calc.logarithm(10), err);
        assertNotEquals("log of 2", 1, calc.logarithm(2), err);
    }

    @Test
    public void factorialTrue(){
        assertEquals("factorial of 5", 120, calc.factorial(5), err);
    }

    @Test
    public void factorialFalse(){
        assertNotEquals("factorial of 0", 0, calc.factorial(0), err);
    }
}
