package com.company.element;

import com.company.shapes.RegularPolygon;

/**
 * Created by Brandt on 5/1/2016.
 */
public class PolygonElementCreator extends ElementCreator {

    @Override
    public double area(int sides, double radius) {
        RegularPolygon polygon = RegularPolygon.create(sides, radius);
        return polygon.area();
    }
}
