package org.tool;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SeriesTest {

    @Test
    public void testArithmetic() {
        Series series = new Series();
        assertEquals(18.0, series.arithmetic(1, 3, 4), 0.0001);
    }

    @Test
    public void testGeometric() {
        Series series = new Series();
        assertEquals(10.0, series.geometric(2, 2, 4), 0.0001);
    }

    @Test
    public void testSumArithmetic() {
        Series series = new Series();
        assertEquals(22.0, series.sumArithmetic(1, 3, 4), 0.0001);
    }

    @Test
    public void testSumGeometric() {
        Series series = new Series();
        assertEquals(15.0, series.sumGeometric(1, 2, 4), 0.0001);
    }

    @Test
    public void testNegativeNInArithmetic() {
        Series series = new Series();
        assertThrows(ArithmeticException.class, () -> series.arithmetic(1, 3, -4));
    }

    @Test
    public void testNegativeNInSumArithmetic() {
        Series series = new Series();
        assertThrows(ArithmeticException.class, () -> series.sumArithmetic(1, 3, -4));
    }

    @Test
    public void testInvalidCommonRatioInSumGeometric() {
        Series series = new Series();
        assertThrows(ArithmeticException.class , () -> series.sumGeometric(1, 1.5, -4));
    }
}
