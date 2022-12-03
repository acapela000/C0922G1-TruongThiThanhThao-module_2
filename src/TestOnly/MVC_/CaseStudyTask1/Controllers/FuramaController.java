package TestOnly.MVC_.CaseStudyTask1.Controllers;

import java.util.Scanner;

public class FuramaController {
    private static int choice;
    private static final Scanner sc = new Scanner(System.in);
    public static void displayMenu() {
    //do method này là static nên bên Main dùng class gọi method luôn, ko cần tạo đối tượng nữa

        do {
        showMenuChoice();

        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1://Employee Management
                menuEmployeeManagement();
                break;
            case 2://Customer Management
                menuCustomerManagement();
                break;
            case 3://Facility Management
                menuFacilityManager();
                break;
            case 4://Booking Management
                bookingManagement();
                break;
            case 5://Promotion Management
                promotionManagement();
                break;
            case 6://Exit
                System.exit(1);
            default:
                System.out.println(" ");
        }
    } while(true);
    }
    public static void showMenuChoice() {
        System.out.println("=== Main Menu ===");
        System.out.println("Choose from menu: ");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }
    public static void menuEmployeeManagement() {//choice 1
        System.out.println("=== Employee Management ===");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Delete employee");
        System.out.println("4. Edit employee");
        System.out.println("5. Return Main menu");

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 5:
                displayMenu();
                break;
            default:
                System.out.println("Option not implemented yet");
        }
    }

    public static void menuCustomerManagement() {//choice 2
        System.out.println("=== Customer Manager ===");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return Main menu");

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 4:
                displayMenu();
                break;
            default:
                System.out.println("Option not implemented yet");
        }
    }
    private static void menuFacilityManager() {//choice 3
        System.out.println("=== Facility Manager ===");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return Main menu");

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 4:
                displayMenu();
                break;
            default:
                System.out.println("Option not implemented yet");
        }
    }

    public static void bookingManagement() {//choice 4
        System.out.println("=== Booking Management ===");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Return Main menu");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 3:
               displayMenu();
               break;
            default:
                System.out.println("Option not implemented yet");
        }
    }

    public static void promotionManagement() {//choice 5
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return Main menu");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 3:
                displayMenu();
            break;
            default:
                System.out.println("Option not implemented yet");
        }
    }



    }

