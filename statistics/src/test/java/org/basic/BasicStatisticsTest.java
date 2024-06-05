package org.basic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BasicStatisticsTest {

    @Test
    public void testMean1() {
        double[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3.0, BasicStatistics.mean(numbers), 0.0001);
    }

    @Test
    public void testMean2() {
        double[] numbers = {10, 20, 30, 40, 50};
        assertEquals(30.0, BasicStatistics.mean(numbers), 0.0001);
    }

    @Test
    public void testMedian1() {
        double[] numbers1 = {1, 2, 3, 4, 5};
        assertEquals(3.0, BasicStatistics.median(numbers1), 0.0001);
    }

    @Test
    public void testMedian2() {
        double[] numbers2 = {1, 2, 3, 4, 5, 6};
        assertEquals(3.5, BasicStatistics.median(numbers2), 0.0001);
    }

    @Test
    public void testMode1() {
        double[] numbers = {1, 2, 2, 3, 4};
        assertEquals(2.0, BasicStatistics.mode(numbers), 0.0001);
    }

    @Test
    public void testMode2() {
        double[] numbers = {5, 5, 4, 4, 3, 3, 3};
        assertEquals(3.0, BasicStatistics.mode(numbers), 0.0001);
    }

    @Test
    public void testPercentile251() {
        double[] numbers = {1, 2, 3, 4, 5};
        assertEquals(2.0, BasicStatistics.percentile25(numbers), 0.0001);
    }

    @Test
    public void testPercentile252() {
        double[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};
        assertEquals(20.0, BasicStatistics.percentile25(numbers), 0.0001);
    }

    @Test
    public void testPercentile751() {
        double[] numbers = {1, 2, 3, 4, 5};
        assertEquals(4.0, BasicStatistics.percentile75(numbers), 0.0001);
    }

    @Test
    public void testPercentile752() {
        double[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(70.0, BasicStatistics.percentile75(numbers), 0.0001);
    }
}   
