package ss6_Inheritance.CircleCylinder;

public class Circle {
    int radius;
    String color;
    double area;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = Math.pow(radius,2)*Math.PI;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +
                ", Area=" + area +
                '}';
    }

}
