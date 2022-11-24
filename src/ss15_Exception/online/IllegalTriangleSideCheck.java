package ss15_Exception.online;

public class IllegalTriangleSideCheck {
    public void checkTriangleSide(int side1,int side2,int side3) throws IllegalTriangleException {
        if (((side1+side2) <= side3) || ((side2+side3) <= side1) || ((side1+side3) <= side2)) {
            throw new IllegalTriangleException("Triangle is illegal");
        } else System.out.println("Triangle is legal");
    }
}
