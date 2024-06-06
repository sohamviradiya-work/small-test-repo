package org.tool;

import static org.junit.Assert.*;
import org.junit.Test;

public class SeriesTest {

    @Test
    public void testArithmetic() {
        Series series = new Series();
        assertEquals(10.0, series.arithmetic(1, 3, 4), 0.0001);
    }

    @Test
    public void testGeometric() {
        Series series = new Series();
        assertEquals(16.0, series.geometric(2, 2, 4), 0.0001);
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

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNInArithmetic() {
        Series series = new Series();
        series.arithmetic(1, 3, -4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNInSumArithmetic() {
        Series series = new Series();
        series.sumArithmetic(1, 3, -4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCommonRatioInSumGeometric() {
        Series series = new Series();
        series.sumGeometric(1, 1.5, -4);
    }
}
