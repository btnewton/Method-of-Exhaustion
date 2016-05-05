package com.company;

import com.company.element.PolygonElementCreator;

public class Main {

    public static void main(String[] args) {
        PolygonElementCreator polygonElementCreator = new PolygonElementCreator();

        final double RADIUS = 3.0;
        final double AREA = Math.PI * Math.pow(RADIUS, 2);

        int n = 6;
        while (n < 10000) {
            double estimatedArea = polygonElementCreator.estimateAreaOfCircle(RADIUS, n);
            System.out.println(n + " sides: " + estimatedArea + "(" + (estimatedArea / AREA * 100) + "%)");
            n *= 2;
        }

        System.out.println("Actual area = " + AREA);
    }
}
