package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {


    @Test
    public void square3() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square3(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}