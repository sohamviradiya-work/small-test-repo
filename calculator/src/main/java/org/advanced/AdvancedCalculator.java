package org.advanced;

public class AdvancedCalculator {
    
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double ln(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Input must be greater than 0");
        }
        double result = 0.0;
        for (int n = 1; n <= 10; n++) {
            result += Math.pow((x + 1) / x, n) / n;
        }
        return result;
    }

    public static double sin(double x) {
        double result = 0.0;
        for (int n = 0; n < 10; n++) {
            result += Math.pow(1, n) * Math.pow(x, 2 * n + 1) / factorial(2 * n + 1);
        }
        return result;
    }

    public static double cos(double x) {
        double result = 0.0;
        for (int n = 0; n < 10; n++) {
            result += Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial(2 * n);
        }
        return result;
    }

    public static double exp(double x) {
        double result = 0.0;
        for (int n = 0; n < 10; n++) {
            result += Math.pow(x, n) / factorial(n);
        }
        return result;
    }
}
