package org.tool;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrigonometryTest {

    @Test
    public void testAngleBetweenSides_Case1() {
        double angle = Trigonometry.angleBetweenSides(3, 4, 5);
        assertEquals(Math.toRadians(90.0), angle, 0.0001);
    }

    @Test
    public void testAngleBetweenSides_Case2() {
        double angle = Trigonometry.angleBetweenSides(5, 12, 13);
        assertEquals(Math.toRadians(90.0), angle, 0.0001);
    }

    @Test
    public void testAngleBetweenSides_Case3() {
        double angle = Trigonometry.angleBetweenSides(8, 15, 17);
        assertEquals(Math.toRadians(90.0), angle, 0.0001);
    }


    @Test
    public void testFindThirdSide_Case1() {
        double side = Trigonometry.findThirdSide(3, 4, Math.toRadians(90));
        assertEquals(4.0, side, 0.0001);
    }

    @Test
    public void testFindThirdSide_Case2() {
        double side = Trigonometry.findThirdSide(5, 12, Math.toRadians(90));
        assertEquals(13.0, side, 0.0001);
    }

    @Test
    public void testFindThirdSide_Case3() {
        double side = Trigonometry.findThirdSide(8, 15, Math.toRadians(90));
        assertEquals(17.0, side, 0.0001);
    }

    

    @Test
    public void testFindThirdAngle_Case1() {
        double angle = Trigonometry.findThirdAngle(Math.toRadians(30), Math.toRadians(60));
        assertEquals(Math.toRadians(90.0), angle, 0.0001);
    }

    @Test
    public void testFindThirdAngle_Case2() {
        double angle = Trigonometry.findThirdAngle(Math.toRadians(45), Math.toRadians(45));
        assertEquals(Math.toRadians(90.0), angle, 0.0001);
    }

    @Test
    public void testFindThirdAngle_Case3() {
        double angle = Trigonometry.findThirdAngle(Math.toRadians(60.0), Math.toRadians(30.0));
        assertEquals(Math.toRadians(90.0), angle, 0.0001);
    }

    @Test
    public void testAreaOfTriangle_Case1() {
        double area = Trigonometry.areaOfTriangle(3, 4, 5);
        assertEquals(6.0, area, 0.0001);
    }

    @Test
    public void testAreaOfTriangle_ZeroArea() {
        double area = Trigonometry.areaOfTriangle(3, 4, 7); 
        assertEquals(0.0, area, 0.0001);
    }


    @Test
    public void testMedianLength_Case1() {
        double median = Trigonometry.medianLength(3, 4, 5);
        System.out.println(median);
        assertEquals(4.27, median, 0.01);
    }

    @Test
    public void testMedianLength_Case2() {
        double median = Trigonometry.medianLength(8, 5, 5);
        assertEquals(3, median, 0.01);
    }

    @Test
    public void testMedianLength_Case3() {
        double median = Trigonometry.medianLength(7, 7, 14);
        assertEquals(10.5, median, 0.01);
    }

}
