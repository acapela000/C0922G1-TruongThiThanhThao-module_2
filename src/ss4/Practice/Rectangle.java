package ss4.Practice;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        }

    public double getArea() {
        return this.height*this.width;
    }
    public double getPerimeter() {
        return (this.height+this.width)*2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}





