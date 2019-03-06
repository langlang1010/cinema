package cn.smileyan.movie.entity;

import java.util.Date;

/**
 * 场次表
 * @author Smileyan
 */
public class MvScreen {
    /**
     * screenId：场次编号
     * roomId：房间编号
     * movieId：电影编号
     * screenPrice：场次价格
     * screenTimeStart：开始时间
     * screenTimeEnd：结束时间
     */
    private String screenId;
    private String roomId;
    private String movieId;
    private double screenPrice;
    private Date screenTimeStart;
    private Date screenTimeEnd;

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public double getScreenPrice() {
        return screenPrice;
    }

    public void setScreenPrice(double screenPrice) {
        this.screenPrice = screenPrice;
    }

    public Date getScreenTimeStart() {
        return screenTimeStart;
    }

    public void setScreenTimeStart(Date screenTimeStart) {
        this.screenTimeStart = screenTimeStart;
    }

    public Date getScreenTimeEnd() {
        return screenTimeEnd;
    }

    public void setScreenTimeEnd(Date screenTimeEnd) {
        this.screenTimeEnd = screenTimeEnd;
    }
}
