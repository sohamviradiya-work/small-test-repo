package org.tool;

public class Series {
    public double arithmetic(double a, double d, int n) {
        if(n<1)
            throw new IllegalArgumentException("n must be a positive integer");
        return a + (n-1)*d;
    }

    public double geometric(double a,double r,int n){
        return a*Math.pow(r,n-1);
    }

    public double sumArithmetic(double a, double d, int n) {
        if (n < 1)
            throw new IllegalArgumentException("n must be a positive integer");
        return n * (2 * a + (n - 1) * d) / 2;
    }

    public double sumGeometric(double a, double r, int n) {
        if (n < 1)
            throw new IllegalArgumentException("n must be a positive integer");
        return a * (1 - Math.pow(r, n)) / (1 - r);
    }
}
