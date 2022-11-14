package ss7_Abstract_Interface.Exercise.Colorable;

public class SquareMain {
    public static void main(String[] args) {

        Colorable colorable = new Colorable()
        {
            @Override
            public String howToColor() {
                return "Color all four sides";
            }
        };
        System.out.println(colorable.howToColor());
    }



}
