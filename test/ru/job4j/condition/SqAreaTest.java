package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {


    @Test
    public void square() {
        int p = 6;
        int k = 2;
        double expected = 1.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square2(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square3() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square3(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}