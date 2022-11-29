package com.cc.java;

public class Triangle extends Shape{
    private double l, h;

    public Triangle( double l, double h ) {
        this.l = l;
        this.h = h;
    }

    @Override
    public double area() { return l * h / 2; }
}