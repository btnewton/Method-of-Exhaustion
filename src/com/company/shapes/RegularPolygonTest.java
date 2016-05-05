package com.company.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Brandt on 5/1/2016.
 */
public class RegularPolygonTest {

    private static final double ACCURACY = 0.00000000000001;

    @org.junit.Test
    public void testArea() throws Exception {
        RegularPolygon square = new RegularPolygon(4, 3);
        double area = square.area();
        assertEquals(9d, area, ACCURACY);
    }

    @Test
    public void testSideLength() throws Exception {
        final double SIDE_LENGTH = 2;
        double radius = Math.sqrt(Math.pow(SIDE_LENGTH, 2) + Math.pow(SIDE_LENGTH, 2)) / 2;
        double calculatedSideLength = RegularPolygon.sideLength(4, radius);
        assertEquals(SIDE_LENGTH, calculatedSideLength, ACCURACY);
    }

    @org.junit.Test
    public void testEquals() throws Exception {
        RegularPolygon regularPolygon1 = new RegularPolygon(3, 12.3);
        RegularPolygon regularPolygon2 = new RegularPolygon(3, 12.3);

        assertEquals(regularPolygon1, regularPolygon2);
    }

    @org.junit.Test
    public void testNotEquals() throws Exception {
        RegularPolygon regularPolygon1 = new RegularPolygon(3, 12.3);
        RegularPolygon regularPolygon2 = new RegularPolygon(3, 12.4);

        assertNotEquals(regularPolygon1, regularPolygon2);
    }
}