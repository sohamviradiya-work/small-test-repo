package org.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdvancedCalculatorTest {
    private static final double DELTA = 1e-2; 

    @Test
    void testCos0() {
        double result = AdvancedCalculator.cos(0);
        assertEquals(1.0, result, DELTA);
    }

    @Test
    void testCosPositive() {
        double result = AdvancedCalculator.cos(Math.PI / 4);
        assertEquals(Math.sqrt(2)/2, result, DELTA);
    }

    @Test
    void testCosNegative() {
        double result = AdvancedCalculator.cos(-Math.PI / 3); 
        assertEquals(0.5, result, DELTA);
    }

    @Test
    void testExp0() {
        double result = AdvancedCalculator.exp(0);
        assertEquals(1.0, result, DELTA);
    }

    @Test
    void testExpPositive() {
        double result = AdvancedCalculator.exp(2); 
        assertEquals(Math.exp(2), result, DELTA);
    }

    @Test
    void testExpNegative() {
        double result = AdvancedCalculator.exp(-1); 
        assertEquals(Math.exp(-1), result, DELTA);
    }

    @Test
    void testLn0() {
        assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.ln(0));
    }

    @Test
    void testLnPositive() {
        double result = AdvancedCalculator.ln(2);
        assertEquals(Math.log(2), result, DELTA);
    }

    @Test
    void testLnNegative() {
        assertThrows(IllegalArgumentException.class, () -> AdvancedCalculator.ln(-3));
    }

    @Test
    void testSin0() {
        double result = AdvancedCalculator.sin(0);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    void testSinPositive() {
        double result = AdvancedCalculator.sin(Math.PI / 6); 
        assertEquals(0.5, result, DELTA);
    }

    @Test
    void testSinNegative() {
        double result = AdvancedCalculator.sin(-Math.PI / 3);
        assertEquals(-Math.sqrt(3)/2, result, DELTA);
    }
}
