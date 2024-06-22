package com.globalpayex;

import java.util.Arrays;
import java.util.HashSet;

public class PlaySet {

    public static void main(String[] args) {
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("mehul");
        uniqueNames.add("jane");
        uniqueNames.add("mehul");
        System.out.println(uniqueNames);

        var list = Arrays.asList(10, 5, 6, 10, 3, 2, 3, 4, 5 , 10, 1);
        HashSet<Integer> uniqueMarks = new HashSet<>(list);
        System.out.println(uniqueMarks);

        for(Integer marks: uniqueMarks) {
            System.out.println(marks);
        }

        var mDiva = Arrays.asList(1, 3, 5);
        var mDivb = Arrays.asList(3, 5, 9);

        // common set of marks that were scored between both the divisions
        // intersection
        HashSet<Integer> s1 = new HashSet<>(mDiva);
        HashSet<Integer> s2 = new HashSet<>(mDivb);

        s1.retainAll(s2);
        System.out.println(s1);

        // all the unique marks scored across divisions
        // union
        HashSet<Integer> s3 = new HashSet<>(mDiva);
        HashSet<Integer> s4 = new HashSet<>(mDivb);
        s3.addAll(s4);
        System.out.println(s3);
    }
}
