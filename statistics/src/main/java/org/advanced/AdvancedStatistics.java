package org.advanced;

public class AdvancedStatistics {

    public static double variance(double[] numbers) {
        double mean = 0;
        for (double num : numbers) {
            mean += num;
        }
        mean /= numbers.length;

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - mean, 2);
        }
        variance /= numbers.length;

        return variance;
    }

    public static double covariance(double[] numbers1, double[] numbers2) {
        if (numbers1.length != numbers2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        double mean1 = 0;
        double mean2 = 0;
        for (int i = 0; i < numbers1.length; i++) {
            mean1 += numbers1[i];
            mean2 += numbers2[i];
        }
        mean1 /= numbers1.length;
        mean2 /= numbers2.length;

        double covariance = 0;
        for (int i = 0; i < numbers1.length; i++) {
            covariance += (numbers1[i] - mean1) * (numbers2[i] - mean2);
        }
        covariance /= numbers1.length;

        return covariance;
    }

    public static double correlation(double[] numbers1, double[] numbers2) {
        double covariance = covariance(numbers1, numbers2);
        if(covariance==0) return 0;
        double stdDev1 = Math.sqrt(variance(numbers1));
        double stdDev2 = Math.sqrt(variance(numbers2));

        return covariance / (stdDev1 * stdDev2);
    }
}
