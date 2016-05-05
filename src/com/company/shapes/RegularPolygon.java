package com.company.shapes;

/**
 * Created by Brandt on 5/1/2016.
 */
public class RegularPolygon {

    private final int sides;
    private final double sideLength;

    public static RegularPolygon create(int sides, double radius) {
        double sideLength = sideLength(sides, radius);
        return new RegularPolygon(sides, sideLength);
    }

    public RegularPolygon(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public int getSides() {
        return sides;
    }

    public double area() {
        return 0.25 * sides * Math.pow(sideLength, 2) * cotangent(Math.PI / sides);
    }

    private double cotangent(double radians) {
        return 1.0 / Math.tan(radians);
    }

    public static double sideLength(int sides, double radius) {
        double internalAngle = (sides - 2) * 180 / (double) sides;
        return 2 * (Math.cos(.5 * Math.toRadians(internalAngle)) * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        } else if (o instanceof RegularPolygon) {
            RegularPolygon regularPolygon = (RegularPolygon) o;
            return regularPolygon.sides == sides && regularPolygon.sideLength == sideLength;
        }

        return false;
    }
}
