package cn.smileyan.movie.entity;

/**
 * 放映室表
 * @author Smileyan
 */
public class MvRoom {
    /**
     * roomId：放映室编号
     * cinemaId：电影编号
     * roomName：放映室名称
     * roomRow：放映室行数大小
     * roomColumn：放映室列数大小
     */
    private  String roomId;
    private String cinemaId;
    private String  roomName;
    private String roomRow;
    private String roomColumn;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomRow() {
        return roomRow;
    }

    public void setRoomRow(String roomRow) {
        this.roomRow = roomRow;
    }

    public String getRoomColumn() {
        return roomColumn;
    }

    public void setRoomColumn(String roomColumn) {
        this.roomColumn = roomColumn;
    }
}
