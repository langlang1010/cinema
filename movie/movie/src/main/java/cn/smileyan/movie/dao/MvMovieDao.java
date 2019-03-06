package cn.smileyan.movie.dao;

import cn.smileyan.movie.entity.MvMovie;

public interface MvMovieDao {
    /**
     * 添加电影
     * @param mvMovie
     * @return
     */
    int addMovie(MvMovie mvMovie);
}
