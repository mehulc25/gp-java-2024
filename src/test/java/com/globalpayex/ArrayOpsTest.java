package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOpsTest {

    @Test
    void testAverage() {
        int[] nos = {6, 5, 10, 1, 2};
        float expected = 4.8f;

        float actual = ArrayOps.average(nos);
        assertEquals(expected, actual);
    }

    @Test
    void testNextGenSum() {
        int actual = ArrayOps.nextGenSum(5, 2, 4, 8);
        assertEquals(19, actual);

        actual = ArrayOps.nextGenSum(5, 2);
        assertEquals(7, actual);

        actual = ArrayOps.nextGenSum();
        assertEquals(0, actual);
    }
}