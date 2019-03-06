package cn.smileyan.movie.entity;

import java.util.Date;

/**
 * 电影表
 * @author Smileyan
 */
public class MvMovie {
    /**
     * movieId：电影编号
     * movieName：电影名称
     * movieRelease：电影发布时间
     * moviePostUrl：电影海报
     * movieInfo：电影简介
     */
    private String movieId;
    private String movieName;
    private Date movieRelease;
    private String moviePostUrl;
    private String movieInfo;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getMovieRelease() {
        return movieRelease;
    }

    public void setMovieRelease(Date movieRelease) {
        this.movieRelease = movieRelease;
    }

    public String getMoviePostUrl() {
        return moviePostUrl;
    }

    public void setMoviePostUrl(String moviePostUrl) {
        this.moviePostUrl = moviePostUrl;
    }

    public String getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(String movieInfo) {
        this.movieInfo = movieInfo;
    }
}
