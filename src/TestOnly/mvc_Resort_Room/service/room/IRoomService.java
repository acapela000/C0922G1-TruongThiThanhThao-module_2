package testOnly.mvc_Resort_Room.service.room;

import testOnly.mvc_Resort_Room.model.room.Room;

import java.io.IOException;
import java.util.List;

public interface IRoomService {
    void addRoom(Room room) throws IOException;
    void editRoom(String code,Room room) throws IOException;
    void deleteRoom(String code) throws IOException;
    List<Room> displayRoom() throws IOException;
    Room searchRoom(String code) throws IOException;

}
