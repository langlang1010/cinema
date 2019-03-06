package cn.smileyan.movie.dao;

import cn.smileyan.movie.entity.MvOa;

import java.util.List;

/**
 * @author Administrator
 */
public interface MvOaDao {
    /**
     *
     * @param oaId
     * @return
     */
    MvOa getById(String oaId);

    /**
     * 获得所有
     * @return
     */
    MvOa getAll();
}
