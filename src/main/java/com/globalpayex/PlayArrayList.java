package com.globalpayex;

import java.util.Arrays;

public class PlayArrayList {

    public static void main(String[] args) {
        var nos = Arrays.asList(10, 4, 1, 9, 8, 7);


        // logic to print only even numbers more than 4 from the nos list
        /* for(Integer n : nos) {
            if (n % 2 == 0 && n > 4) {
                System.out.println(n);
            }
        } */
        nos.forEach(element -> {
            if (element % 2 == 0 && element > 4) {
                System.out.println(element);
            }
        });

        var names = Arrays.asList("Mehul chopra", "Jane", "Jill", "Mumbai");
        names.forEach(name -> {
            if (name.length() > 5) {
                System.out.println(name.toUpperCase());
            } else {
                System.out.println(name.toLowerCase());
            }
        });

    }
}
