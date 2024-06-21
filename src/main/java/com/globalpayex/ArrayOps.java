package com.globalpayex;

public class ArrayOps {
    public static float average(int[] elements) {
        int sum = 0;
        for (int element: elements) {
            sum += element;
        }

        return (float)sum / elements.length;
    }

    public static int nextGenSum(int... elements) {
        int sum = 0;
        for (int element: elements) {
            sum += element;
        }

        return sum;
    }
}
