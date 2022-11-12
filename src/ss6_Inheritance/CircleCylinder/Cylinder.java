package ss6_Inheritance.CircleCylinder;

public class Cylinder extends Circle{
    double volumn;
    int height;

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.volumn = Math.PI*Math.pow(radius,2)*height;
        this.height = height;
    }

    public double getVolumn() {
        return volumn;
    }

    public void setVolumn(double volumn) {
        this.volumn = volumn;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color +
                ", volumn=" + volumn +
                ", height=" + height +
                '}';
    }
}
