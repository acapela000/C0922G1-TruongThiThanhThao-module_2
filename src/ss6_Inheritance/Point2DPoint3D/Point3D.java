package ss6_Inheritance.Point2DPoint3D;

public class Point3D extends Point2D {
    float z = 3.0f;

    Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ () {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.x,this.y,this.z};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
