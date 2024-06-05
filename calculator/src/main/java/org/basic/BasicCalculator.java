package org.basic;

public class BasicCalculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 /num2;
    }

    public static int modulus(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot perform modulus by zero");
        }
        return num1 % num2;
    }
}
