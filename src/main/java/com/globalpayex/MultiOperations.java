package com.globalpayex;

import java.util.Scanner;

public class MultiOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter a: ");
            int a = scanner.nextInt();
            System.out.println("enter b: ");
            int b = scanner.nextInt();

            MultiOperations.performAddition(a, b);
            MultiOperations.performMultiplication(a, b);
        }
    }

    private static void performMultiplication(int a, int b) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(String.format("multiplication is %s", a * b));
    }

    private static void performAddition(int a, int b) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(String.format("addition is %s", a + b));
    }
}
