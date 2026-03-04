// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;
import java.lang.Math;

public class Circle implements Shape {
    
    private final double radius;
    public Circle(double radius) {    this.radius = radius;    }

    @Override
    public double area(){
        return Math.PI*Math.sqrt(radius);
    }
    @Override
    public double perimeter(){
        return (2)*(Math.PI)*(radius);
    }

    public static void main(String[] args) {
        
        // ...

    }
}