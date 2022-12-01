/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.uniqueidea.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lequa
 */
public class MathUtilTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        assertEquals(expected, actual);
        expected = 1;
        actual = MathUtil.getFactorial(1);
        assertEquals(expected, actual);
        assertEquals(2, MathUtil.getFactorial(2));
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        assertEquals(6, MathUtil.getFactorial(3));

        assertEquals(24, MathUtil.getFactorial(4));

        assertEquals(720, MathUtil.getFactorial(6));
    }

    public void testFactorialGivenWrongArgumentThrowException() {
        MathUtil.getFactorial(-5);
    }

    @Test
    public void tryJUnitFirst() {
        assertEquals(0, 0);
    }

}
