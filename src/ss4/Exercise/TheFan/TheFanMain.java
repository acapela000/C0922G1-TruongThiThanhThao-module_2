package ss4.Exercise.TheFan;

import java.util.Scanner;

public class TheFanMain {
    public static void main(String[] args) {

        TheFan theFan1 = new TheFan(3,10,"yellow",true);
        TheFan theFan2 = new TheFan(2,5,"blue",false);

        System.out.println("Fan1 is " + theFan1.toString());
        System.out.println("Fan2 is " + theFan2.toString());
    }


}
