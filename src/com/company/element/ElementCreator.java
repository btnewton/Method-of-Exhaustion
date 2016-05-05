package com.company.element;

/**
 * Created by Brandt on 5/1/2016.
 */
public abstract class ElementCreator {

    public double estimateAreaOfCircle(double radius, int degree) {
        return area(degree, radius);
    }

    public abstract double area(int sides, double radius);
}
