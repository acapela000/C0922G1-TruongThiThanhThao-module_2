package ss6_Inheritance.CircleCylinder;

import java.awt.geom.Area;

public class CircleCylinderMain {
    public static void main(String[] args) {
        Circle circle = new Circle(15,"lightgreen");

        Circle cylinder = new Cylinder(25,"red",20);

        System.out.println(circle.toString());
        System.out.println(cylinder.toString());

//        System.out.println("Area of circle = " + circle.getArea());
//        System.out.println("Color of circle is " + circle.getColor());
//        System.out.println("Color of cylinder is " + cylinder.getColor());
//        System.out.println("Height of cylinder = " + ((Cylinder)cylinder).getHeight());
    }
}
