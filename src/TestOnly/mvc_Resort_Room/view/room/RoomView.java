package testOnly.mvc_Resort_Room.view.room;

import testOnly.mvc_Resort_Room.controller.room.RoomController;
import testOnly.mvc_Resort_Room.exceptions.RoomException;
import testOnly.mvc_Resort_Room.model.room.Room;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RoomView {
    private static final Scanner sc = new Scanner(System.in);

    public void displayMenu() throws IOException {
        RoomController roomController = new RoomController();

        int choice = 0;

        do {
            System.out.println("Choose from menu:\n[1.Add]\n[2.Edit]\n[3.Display]\n[4.Delete]\n[5.Search]\n[6.Exit]");
            //test custom try-catch -> 'checkChoice'
            try {
                choice = Integer.parseInt(sc.nextLine());
                checkChoice(choice);
            } catch (NumberFormatException e){
                System.err.println("Invalid choice.");
                continue; //-> jump to next Iteration
            } catch (RoomException rm) {
                System.out.println(rm.getMessage());
                continue;
            }

            switch (choice) {
                case 1://Add
                    System.out.print("Input room's code to add: ");
                    String addCode = sc.nextLine();
                    System.out.print("Input room's name to add: ");
                    String addName = sc.nextLine();
                    System.out.print("Input room's type to add: ");
                    String addType = sc.nextLine();
                    System.out.print("Input room's price to add: ");
                    int addPrice = Integer.parseInt(sc.nextLine());

                    Room room = new Room(addCode, addName, addType,addPrice);
                    roomController.addRoom(room);
                    break;
                case 2://Edit
                    System.out.print("Input room's code to edit: ");
                    String code = sc.nextLine();
                    System.out.println("Input room's name to edit: ");
                    String editName = sc.nextLine();
                    System.out.println("Input room's type to edit: ");
                    String editType = sc.nextLine();
                    System.out.println("Input room's price to edit: ");
                    int editPrice = Integer.parseInt(sc.nextLine());

                    Room room1 = new Room(code, editName, editType,editPrice);
                    roomController.editRoom(code, room1);
                    break;
                case 3://Display
                    List<Room> roomList = roomController.displayRoom();
                    for (Room r : roomList) {
                        System.out.println(r);
                    }
                    break;
                case 4://Delete
                    System.out.print("Input room's code to delete: ");
                    String deleteCode = sc.nextLine();

                    roomController.deleteRoom(deleteCode);
                    break;
                case 5://Search
                    System.out.print("Input room's code U wanna search: ");
                    String searchCode = sc.nextLine();

                    roomController.searchRoom(searchCode);
                    break;
                case 6://Exit
                    System.exit(1);
                    break;
                default:
                    System.out.println("Your choice is out of menu.");
            }
        } while(true);
    }

    public void checkChoice(int choice) throws RoomException{
        if (choice <= 0 || choice > 6) {
            throw new RoomException();
        }
        //else System.out.println("ALOHA");
    }

}
