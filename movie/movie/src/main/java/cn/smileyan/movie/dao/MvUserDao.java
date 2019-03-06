package cn.smileyan.movie.dao;

import cn.smileyan.movie.entity.MvUser;

/**
 * @author Administrator
 */
public interface MvUserDao {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertUser(MvUser user);

    /**
     * 根据用户名查询id
     * @param username
     * @return
     */
    String getIdByUsername(String username);

    /**
     * 根据用户名和密码查询用户Id
     * @param username
     * @param password
     * @return
     */
    String getIdByUsernameAndPassword(String username,String password);

    /**
     * 根据用户Id删除
     * @param userId
     * @return
     */
    void deleteById(String userId);


    /**
     * 根据id查用户信息
     * @param userId
     * @return 用户信息
     */
    MvUser getUserInfoById(String userId);
}
