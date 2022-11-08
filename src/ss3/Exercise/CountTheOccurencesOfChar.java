package ss3.Exercise;

import java.util.Scanner;

public class CountTheOccurencesOfChar {
    public static void main(String[] args) {
        String str = "aBbcAa";
        //String[] strArr = str.split("");
        System.out.println("Input a random character");
        Scanner sc = new Scanner(System.in);
        String character = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character.equals(String.valueOf(str.charAt(i)))){
            //    character.equalsIgnoreCase(strArr[i])
                count++;
            }
        }
        System.out.println("The occurences of the input character: " + count);
    }
}
