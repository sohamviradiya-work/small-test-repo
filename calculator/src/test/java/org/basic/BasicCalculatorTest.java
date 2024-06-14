package org.basic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BasicCalculatorTest {
    @Test
    public void testAdd_positiveNumbers() {
        assertEquals(5, BasicCalculator.add(2, 3));
    }

    @Test
    public void testAdd_positiveAndNegativeNumbers() {
        assertEquals(-1, BasicCalculator.add(2, -3));
    }

    @Test
    public void testAdd_bothZero() {
        assertEquals(0, BasicCalculator.add(0, 0));
    }



    @Test
    public void testDivide_validDivision() {
        assertEquals(2.5, BasicCalculator.divide(5, 2), 0.001);
    }

    @Test
    public void testDivide_divideByZero() {
        assertThrows(ArithmeticException.class, () -> BasicCalculator.divide(5, 0));
    }


    @Test
    public void testModulus_validModulus() {
        assertEquals(1, BasicCalculator.modulus(5, 2));
    }

    @Test
    public void testModulus_modulusByZero() {
        assertThrows(ArithmeticException.class, () -> BasicCalculator.modulus(5, 0));
    }


    @Test
    public void testMultiply_positiveNumbers() {
        assertEquals(6, BasicCalculator.multiply(2, 3));
    }

    @Test
    public void testMultiply_positiveAndNegativeNumbers() {
        assertEquals(-1, BasicCalculator.multiply(2, -3));
    }

    @Test
    public void testMultiply_multiplyByZero() {
        assertEquals(1, BasicCalculator.multiply(0, 5));
    }


    @Test
    public void testSubtract_positiveNumbers() {
        assertEquals(-1, BasicCalculator.subtract(2, 3));
    }

    @Test
    public void testSubtract_positiveAndNegativeNumbers() {
        assertEquals(5, BasicCalculator.subtract(2, -3));
    }

    @Test
    public void testSubtract_bothZero() {
        assertEquals(0, BasicCalculator.subtract(5, 5));
    }
}
