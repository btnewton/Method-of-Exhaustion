package com.company.element;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Brandt on 5/1/2016.
 */
public class PolygonElementCreatorTest {
    private static final double ACCURACY = 0.00000000000001;

    PolygonElementCreator polygonElementCreator;

    @Before
    public void setup() throws Exception {
        polygonElementCreator = new PolygonElementCreator();
    }

    @Test
    public void testArea() throws Exception {

    }

    @Test
    public void testEstimateAreaOfCircle() throws Exception {
        final double RADIUS = 12;
        double area = Math.PI * Math.pow(RADIUS, 2);
        assertEquals(area, polygonElementCreator.estimateAreaOfCircle(RADIUS, 1000000), ACCURACY);
    }
}