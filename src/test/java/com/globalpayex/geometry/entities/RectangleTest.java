package com.globalpayex.geometry.entities;

import com.abc.geometry.Shape;
import com.abc.geometry.ShapeStatistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea() {
        var r1 = new Rectangle(4, 2);
        var expected = 8;

        int actual = r1.area();
        assertEquals(expected, actual);
    }

    @Test
    void testPerimeter() {
        var r1 = new Rectangle(4, 2);
        var expected = 12;

        int actual = r1.perimeter();
        assertEquals(expected, actual);
    }

    @Test
    void testShapeStatistics() {
        var r1 = new Rectangle(4, 2);
        var expected = "***\nArea is 8\nPerimeter is 12\n***";

        var actual = ShapeStatistics.calculate(r1);
        assertEquals(expected, actual);
    }

    @Test
    void testShapeStatisticsSquare() {
        var s1 = new Square(4);
        var expected = "***\nArea is 16\nPerimeter is 16\n***";

        var actual = ShapeStatistics.calculate(s1);
        assertEquals(expected, actual);

        // var s = new Shape(); // cannot create object of an abstract class
    }
}