package com.cc.java;

public class App {
    static Rectangle rectangle = new Rectangle( 10, 10 );
    static Circle circle = new Circle( 3 );
    static Triangle triangle = new Triangle( 10, 10 );
    
    
    public static void main(String[] args) {
        Out.o( Out.c( "#y" ) + Out.l( "Flächenberechnung: " ) );
            Out.o( Out.t( 1 ) + Out.c( "#c" ) + "Rechteck: " + Out.c( "#g" ) + rectangle.area() );
            Out.o( Out.t( 1 ) + Out.c( "#c" ) + "Dreieck: " + Out.c( "#g" ) + triangle.area() );
            Out.o( Out.t( 1 ) + Out.c( "#c" ) + "Kreis: " + Out.c( "#g" ) + circle.area() );

        Out.o( Out.n() + Out.c( "#y" ) + Out.l( "Flächendifferenz" ) );
            Out.o( Out.t( 1 ) + Out.c( "#c" ) + "Rechteck - Dreieck: " + Out.c( "#g" ) + areaDiff( rectangle, triangle) );
            Out.o( Out.t( 1 ) + Out.c( "#c" ) + "Rechteck - Kreis: " + Out.c( "#g" ) + areaDiff( rectangle, circle) );
    }

    // Konkrete Methode
        // private static double areDiff( Rectangle r, Triangle t) {
        //     return r.area() - t.area();        
        // }
        // private static double areDiff( Rectangle r, Circle c) {
        //     return r.area() - c.area();        
        // }

    // Abstrakte Methode
        private static double areaDiff( Shape s1, Shape s2) {
            return s1.area() - s2.area();
        }
}