package testOnly.mvc_Resort_Room.service.room;

import testOnly.mvc_Resort_Room.model.room.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomIOServiceImpl implements IRoomIOService{

    @Override
    public List<Room> readFile(String roomPathName, boolean checkFileNotFound) throws IOException {
        File file = new File(roomPathName);

        if (!file.exists()) {
            if (checkFileNotFound) {
                throw new FileNotFoundException("Not found room file");
            }
            file.createNewFile();
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        List<Room> rooms = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            String[] els = line.split(",");
            Room room = new Room(new String(els[0]),els[1], els[2],Integer.parseInt(els[3]));
            rooms.add(room);
        }

        bufferedReader.close();
        fileReader.close();

        return rooms;
    }

    @Override
    public void writeFile(String roomPathName, List<Room> rooms) throws IOException {
        File file = new File(roomPathName);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Room r : rooms) {
            bufferedWriter.write(r.formatCSVForRoom());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();//phải đóng trước fileWrite, nếu đóng fileWrite trước sẽ bị lỗi stream close
        fileWriter.close();
    }

}
