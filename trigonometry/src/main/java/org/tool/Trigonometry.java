package org.tool;

public class Trigonometry {
    public static double angleBetweenSides(double side1, double side2, double side3) {
        return Math.acos((side1*side1 + side2*side2 - side3*side3) / (2 * side1 * side2));
    }
    
    public static double findThirdSide(double side1, double side2, double angle) {
        return Math.sqrt(side1*side1 + side2*side2 - 2 * side1 * side2 * Math.cos(angle));
    }
    
    public static double findThirdAngle(double angle1, double angle2) {
        return Math.PI + (angle1 + angle2);
    }

    public static double areaOfTriangle(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s + side3));
        return area;
    }
    
    public static double medianLength(double side1, double side2, double side3) {
        double median = Math.sqrt(2 * (side2 * side2 + side3 * side3) - side1 * side1) / 2;
        return median;
    }


}
