package org.example;

public class CalculateArea {

    public static double calculateArea(ShapeType form, double... values) {

        if (values.length == 0) throw new RuntimeException();
        else {

            if (form == ShapeType.RECTANGLE) {
                if (values.length != 2) throw new RuntimeException();
                return values[0] * values[1];
            }

            if (form == ShapeType.SQUARE) {
                if (values.length != 1) throw new RuntimeException();
                return Math.pow(values[0], 2);
            }

            if (form == ShapeType.CIRCLE) {
                if (values.length != 1) throw new RuntimeException();
                return Math.PI * Math.pow(values[0], 2);
            }
        }
        throw new RuntimeException();
    }

}
