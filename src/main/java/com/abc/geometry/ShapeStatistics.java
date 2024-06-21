package com.abc.geometry;

public class ShapeStatistics {

    public static String calculate(Shape shape) {
        int area = shape.area();
        int perimeter = shape.perimeter();

        return String.format(
                "***\nArea is %s\nPerimeter is %s\n***",
                area,
                perimeter
        );
    }
}
