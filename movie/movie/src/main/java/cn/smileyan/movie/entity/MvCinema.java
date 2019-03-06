package cn.smileyan.movie.entity;

/**
 * 影院表
 * @author Smileyan
 */
public class MvCinema {
    /**
     * cinemaId：影院编号
     * brandId：商家编号
     * cinemaName：影院名称
     * cinemaAddr：影院所在地址
     * cinemaCity：影院所在城市
     */
    private String cinemaId;
    private String brandId;
    private String cinemaName;
    private String cinemaAddr;
    private String cinemaCity;

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaAddr() {
        return cinemaAddr;
    }

    public void setCinemaAddr(String cinemaAddr) {
        this.cinemaAddr = cinemaAddr;
    }

    public String getCinemaCity() {
        return cinemaCity;
    }

    public void setCinemaCity(String cinemaCity) {
        this.cinemaCity = cinemaCity;
    }
}
