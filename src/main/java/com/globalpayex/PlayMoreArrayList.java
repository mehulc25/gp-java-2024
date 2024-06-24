package com.globalpayex;

import java.util.Arrays;
import java.util.Collections;

public class PlayMoreArrayList {

    public static void main(String[] args) {
        var nos = Arrays.asList(10, 4, 1, 9, 8, 7);
        // display all elements of nos list one per line
        // nos.forEach(no -> System.out.println(no));

        // Method references
        // nos.forEach(PlayMoreArrayList::printElement);
        // instance method references
        nos.forEach(System.out::println);

        // sort the elements of nos list using method reference
        // static method references
        Collections.sort(nos, PlayMoreArrayList::descendingComparator);
        System.out.println(nos);
    }

    private static int descendingComparator(Integer n1, Integer n2) {
        return n2.compareTo(n1);
    }

    private static void printElement(Integer no) {
        System.out.println(no);
    }
}
