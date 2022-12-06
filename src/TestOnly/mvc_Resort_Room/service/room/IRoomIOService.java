package testOnly.mvc_Resort_Room.service.room;

import testOnly.mvc_Resort_Room.model.room.Room;

import java.io.IOException;
import java.util.List;

public interface IRoomIOService {
    List<Room> readFile(String roomPathName, boolean checkFileNotFound) throws IOException;
    void writeFile(String roomPathName,List<Room> rooms) throws IOException;
}
