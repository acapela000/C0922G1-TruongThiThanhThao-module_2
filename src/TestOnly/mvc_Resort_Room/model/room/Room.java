package testOnly.mvc_Resort_Room.model.room;

public class Room implements Comparable<Room>{
    private String roomCode;
    private String roomName;
    private String roomType;
    private int roomPrice;

//    public Room(String i, String el, int parseInt) {
//    }

    public Room(String roomCode, String roomName, String roomType,int roomPrice) {
        this.roomCode = roomCode;
        this.roomName = roomName;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

//    public Room(String roomCode, String roomName) {
//        this(roomCode, roomName, "", 0);
//    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return "==" + roomCode + "==" + '\n' +
                "\t" + "roomName: " + roomName + '\n' +
                "\t" + "roomType: " + roomType + '\n' +
                "\t" + "roomPrice: " + roomPrice ;
    }

    @Override
    public int compareTo(Room o) {
        if (this.roomPrice - o.roomPrice > 0) {
            return 1;
        } else if (this.roomPrice - o.roomPrice < 0) {
            return -1;
        } else return 0;
    }

    public String formatCSVForRoom() {
        return this.getRoomCode() + "," + this.getRoomName() + "," + this.getRoomType() + "," + this.getRoomPrice();
    }
}
