package testOnly.mvc_Resort_Room.service.room;

import testOnly.mvc_Resort_Room.model.room.Room;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomServiceImpl implements IRoomService{
    private List<Room> roomList = new ArrayList<>();
    // IO File
    private static final String ROOM_PATH_NAME =
        "D:\\bootcamp\\module_2\\src\\TestOnly\\MVC_BookProduct\\FileData\\File.csv";
    private final RoomIOServiceImpl roomIOService = new RoomIOServiceImpl();

    @Override
    //public void addRoom(Room room) { roomList.add(room);}
    //IO File
    public void addRoom(Room room) throws IOException {
        List<Room> rooms = this.roomIOService.readFile(ROOM_PATH_NAME,false);
        for (Room r : rooms) {
            if (r.getRoomCode() == room.getRoomCode()) {
                throw new IOException();
            }
        }
        rooms.add(room);
        this.roomIOService.writeFile(ROOM_PATH_NAME,rooms);
    }

    @Override
    public void editRoom(String code,Room room) throws IOException {
        //phan IO file
        List<Room> rooms = this.roomIOService.readFile(ROOM_PATH_NAME,false); //IO File

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getRoomCode().equals(code)) {
                //roomList.get(i).setRoomCode(code);
                rooms.set(i,room);
            }
        }
        // IO file
        this.roomIOService.writeFile(ROOM_PATH_NAME,rooms);
    }

    @Override
    public void deleteRoom(String code) throws  IOException {
        //IO File
        Room deleteRoom = null;
        List<Room> rooms = this.roomIOService.readFile(ROOM_PATH_NAME,false);

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getRoomCode().equals(code)) {
                deleteRoom = rooms.get(i);
               break;
            }
        }

        if (deleteRoom == null) {
            throw new IOException();// need to create 'NotFoundRoomException'
        }

        rooms.remove(deleteRoom);
        this.roomIOService.writeFile(ROOM_PATH_NAME,rooms);
    }

    @Override
    /*public List<Room> displayRoom() {
        return roomList;
    }*/
    public List<Room> displayRoom() throws IOException {
        return this.roomIOService.readFile(ROOM_PATH_NAME,true);
    }
    @Override
    public Room searchRoom(String code) throws IOException {
//        for (int i = 0; i < roomList.size(); i++) {
//            if (roomList.get(i).getRoomCode().equals(code)) {
//                return roomList.get(i);
//            }
//        }
//        return null;
        List<Room> rooms = this.roomIOService.readFile(ROOM_PATH_NAME,false); //IO File

        for (Room r: rooms) {
            //System.out.println("Search room: " + r);
            if (r.getRoomCode().equals(code)) {
                return r;
            }
        }
        return null;
    }
     //this.roomIOService.writeFile(ROOM_PATH_NAME,rooms);

}
