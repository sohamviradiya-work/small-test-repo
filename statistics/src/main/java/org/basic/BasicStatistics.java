package org.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BasicStatistics {

    public static double mean(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double median(double[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        if (n % 2 == 0) {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            return numbers[n / 2];
        }
    }

    public static double mode(double[] numbers) {
        Map<Double, Integer> frequencyMap = new HashMap<>();
        for (double num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        double mode = numbers[0];
        int maxCount = 0;
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public static double percentile25(double[] numbers) {
        Arrays.sort(numbers);
        int index = (int) Math.ceil(0.5 * numbers.length) - 1;
        return numbers[index];
    }

    public static double percentile75(double[] numbers) {
        Arrays.sort(numbers);
        int index = (int) Math.ceil(0.75 * numbers.length) - 1;
        return numbers[index];
    }
}
