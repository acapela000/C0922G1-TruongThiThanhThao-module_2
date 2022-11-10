package ss5_Static.Exercise;

class CircleMain {
    protected static void main(String[] args) {
        Circle circle = new Circle();

        circle.getArea();
        circle.getRadius();
        circle.setColor("YeYeLLoww :) hihi");

        double area = circle.getArea();
        System.out.println("Area of circle = " + area);
        double Radius = circle.getRadius();
        System.out.println("Radius of circle = " + Radius);
        String Color = circle.getColor();
        System.out.println("Color of circle is " + Color);

    }
}
