package TestOnly.MVC_.CaseStudyTask1.Controllers;

import TestOnly.MVC_.CaseStudyTask1.Model.Employee;
import TestOnly.MVC_.CaseStudyTask1.Model.Customer;
import TestOnly.MVC_.CaseStudyTask1.Model.Booking;
import TestOnly.MVC_.CaseStudyTask1.Model.Facility;
//import TestOnly.MVC_.CaseStudyTask1.Service.BookingServiceImpl;
import TestOnly.MVC_.CaseStudyTask1.Service.CustomerServiceImpl;
import TestOnly.MVC_.CaseStudyTask1.Service.EmployeeServiceImpl;
import TestOnly.MVC_.CaseStudyTask1.Service.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static int choice;
    private static final Scanner sc = new Scanner(System.in);

    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    //static BookingServiceImpl bookingService = new BookingServiceImpl();

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
            case 1:
                employeeService.display();
                break;
            case 2:
                Employee employee = new Employee("T123",907123456,"05/06/2000","Male","Truong","Thao","Da Nang","thao@gmail.vn");
                employeeService.add(employee);
                break;
            case 3:

                System.out.print("Input code to delete: ");
                String deleteCode = sc.nextLine();
                //employeeService.delete();
                break;
            case 4:
                System.out.print("Input employee's code: ");
                String editCode = sc.nextLine();
                System.out.print("Input employee's name to edit: ");
                String editEmployeeName = sc.nextLine();
                System.out.print("Input employee's address to edit: ");
                String editEmployeeAddress = sc.nextLine();
                Employee updatedE = new Employee("Thanh","New York");
//                updatedE.setPersonalCode(editCode);
//                updatedE.setFirstName(editEmployeeName);
//                updatedE.setAddress(editEmployeeAddress);
                employeeService.edit(updatedE);
                break;
            case 5:
                displayMenu();
                break;
            default:
                System.out.println("Oops! Waiting for fixing problems");
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
            case 1:
                customerService.display();
                break;
            case 2:
                Customer customer = new Customer("Aloha",345,"2/3/1999","Famale","John","Smith","HCM","xyz@code.co");
                customerService.add(customer);
                break;
            case 3:
                System.out.print("Input customer's code to edit: ");
                String editCustomerCode = sc.nextLine();
                System.out.print("Input customer's name to edit: ");
                String editCustomerName = sc.nextLine();
                System.out.print("Input customer's address to edit: ");
                String editCustomerAddress = sc.nextLine();
                Customer editC = new Customer("Truong","Ha Noi");
                customerService.edit(editC);
                break;
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
            case 1:
                facilityService.display();
                break;
            case 2://add

                break;
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
            case 1:
                System.out.print("Input booking code to add: ");
                String addCode = sc.nextLine();
                Booking booking = new Booking();

                break;
            case 2:
                System.out.println();
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

