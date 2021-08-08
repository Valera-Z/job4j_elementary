package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight160ThenWeight69() {
        short height = 160;
        double expected = 69.0;
        double result = Fit.manWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenWomanHeight150ThenWeight46() {
        short height = 150;
        double expected = 46.0;
        double result = Fit.womanWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }
}