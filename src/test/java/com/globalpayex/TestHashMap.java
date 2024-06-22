package com.globalpayex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class TestHashMap {

    @Test
    void testMap1() {
        HashMap<Integer, String> map = new HashMap<>();
        assertEquals(0, map.size());

        // add an entry
        map.put(10, "mehul");
        map.put(5, "jane");
        assertEquals(2, map.size());

        // get a value of an entry
        assertEquals("jane", map.get(5));
        assertEquals("mehul", map.get(10));

        // update an entry in the map
        map.put(5, "jill");
        assertEquals("jill", map.get(5));

        // delete an entry from the map
        map.remove(10);
        assertEquals(1, map.size());

        // get a list of all the values from the map
        var values = map.values();
        System.out.println(values);

        // get a list of all the keys from the map
        var keys = map.keySet();
        System.out.println(keys);
    }
}
