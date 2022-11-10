package ss5_Static.Exercise;

import java.awt.geom.Area;

public class Circle {
    protected double radius = 1.0;
    protected String color = "red";
    protected double Area = radius*2;

    protected Circle() {

    }

    protected double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected double getArea() {
        return Area;
    }

    protected void setArea(double area) {
        Area = area;
    }

    //function with parameter and without parameter
    protected void Circle() {
    };

    protected Circle(double radius) {
    };

}
