package org.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdvancedStatisticsTest {
    private static final double DELTA = 1e-2; 
    
    @Test
    void testVarianceSimple() {
        double[] numbers = {1, 2, 3, 4, 5};
        double result = AdvancedStatistics.variance(numbers);
        assertEquals(2.0, result, DELTA);
    }

    @Test
    void testVarianceSingleElement() {
        double[] numbers = {5};
        double result = AdvancedStatistics.variance(numbers);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    void testVarianceSameElements() {
        double[] numbers = {2, 2, 2, 2, 2};
        double result = AdvancedStatistics.variance(numbers);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    void testCovarianceSimple() {
        double[] numbers1 = {1, 2, 3, 4, 5};
        double[] numbers2 = {5, 4, 3, 2, 1};
        double result = AdvancedStatistics.covariance(numbers1, numbers2);
        assertEquals(-2.0, result, DELTA);
    }

    @Test
    void testCovariancePositiveRelation() {
        double[] numbers1 = {1, 2, 3, 4, 5};
        double[] numbers2 = {2, 4, 6, 8, 10};
        double result = AdvancedStatistics.covariance(numbers1, numbers2);
        assertEquals(4.0, result, DELTA);
    }

    @Test
    void testCovarianceDifferentLengths() {
        double[] numbers1 = {1, 2, 3};
        double[] numbers2 = {4, 5};
        assertThrows(IllegalArgumentException.class, () -> AdvancedStatistics.covariance(numbers1, numbers2));
    }

    @Test
    void testCorrelationSimple() {
        double[] numbers1 = {1, 2, 3, 4, 5};
        double[] numbers2 = {5, 4, 3, 2, 1};
        double result = AdvancedStatistics.correlation(numbers1, numbers2);
        assertEquals(-1.0, result, DELTA);
    }

    @Test
    void testCorrelationPositiveRelation() {
        double[] numbers1 = {1, 2, 3, 4, 5};
        double[] numbers2 = {2, 4, 6, 8, 10};
        double result = AdvancedStatistics.correlation(numbers1, numbers2);
        assertEquals(1.0, result, DELTA);
    }

    @Test
    void testCorrelationNoRelation() {
        double[] numbers1 = {1, 2, 3, 4, 5};
        double[] numbers2 = {7, 7, 7, 7, 7};
        double result = AdvancedStatistics.correlation(numbers1, numbers2);
        assertEquals(0.0, result, DELTA);
    }
}
