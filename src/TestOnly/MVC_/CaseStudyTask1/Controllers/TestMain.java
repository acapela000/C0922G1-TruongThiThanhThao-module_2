package TestOnly.MVC_.CaseStudyTask1.Controllers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
    private static final Scanner sc = new Scanner(System.in);
    private static Pattern pattern;
    private static Matcher matcher;
    public static  String SERVICE_CODE = "^[S][V]([V][L]|[R][O])[-][0-9]{4}$";
    public static  String SERVICE_NAME = "^[A-Z]{1}[a-z]\\w+$";
    public static String SERVICE_ROOM = "^([S][V][R][O])[-][A-Z]{1}[a-z]\\w+$";
    private static String serviceCode, serviceName,serviceRoom;

    public static void main(String[] args) {
        do {
            try {
                System.out.print("Input service code: ");
                serviceCode = sc.nextLine(); //"SVRO-9999"
                System.out.print("Input service name: ");
                serviceName = sc.nextLine(); //Pool, Garden, Cleaning, Rentcar, Pet
                System.out.print("Input service room: ");
                serviceRoom = sc.nextLine(); //SVRO-Twins, SVRO-Double, SVRO-Single
                pattern = Pattern.compile(SERVICE_CODE);
                pattern = Pattern.compile(SERVICE_NAME);
                pattern = Pattern.compile(SERVICE_ROOM);
                matcher = pattern.matcher(serviceCode);
                matcher = pattern.matcher(serviceName);
                matcher = pattern.matcher(serviceRoom);
                if (matcher.matches() == false) {
                    throw new Exception(String.valueOf(matcher));
                }
            } catch (Exception e) {
                System.out.println("Input is out of format");
                continue;
            }
            FuramaController.displayMenu();
        } while (true);

    }
}
