package cn.smileyan.movie.service.common;

import cn.smileyan.movie.entity.MvUser;

public interface UserService {
    /**
     * 添加用户
     * @param mvUser
     * @return
     */
    int addUser(MvUser mvUser);

    /**
     * 根据用户名查询用户ID
     * @param username
     * @return
     */
    String getUserIdByUsername(String username);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    String getUserIdByUsernameAndPassword(String username, String password);

    /**
     * 根据用户id删除用户
     * @param userId
     */
    void deleteUserById(String userId);

    /**
     *
     * @param userId
     * @return
     */
    MvUser getUserInfoById(String userId);
}
