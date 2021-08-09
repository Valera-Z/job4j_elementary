package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenP1X0Y5AndP2X0Y1Dist4() {
        int x1 = 0;
        int y1 = 5;
        int x2 = 0;
        int y2 = 1;
        double expected = 4;
        double result = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,result, 0.01);
    }

    public void whenP1X10Y0AndP2XMinus10Y0Dist20() {
        int x1 = 10;
        int y1 = 0;
        int x2 = -10;
        int y2 = 0;
        double expected = 20;
        double result = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,result, 0.01);
    }

    public void whenP1X1Y5AndP2X1Y1Dist4() {
        int x1 = 1;
        int y1 = 5;
        int x2 = 1;
        int y2 = 1;
        double expected = 4;
        double result = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected,result, 0.01);
    }
}