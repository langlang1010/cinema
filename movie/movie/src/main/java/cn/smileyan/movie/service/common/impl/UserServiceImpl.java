package cn.smileyan.movie.service.common.impl;

import cn.smileyan.movie.dao.MvUserDao;
import cn.smileyan.movie.entity.MvUser;
import cn.smileyan.movie.service.common.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private MvUserDao mvUserDao;
    @Override
    public int addUser(MvUser mvUser) {
        return mvUserDao.insertUser(mvUser);
    }

    @Override
    public String getUserIdByUsername(String username) {
        return mvUserDao.getIdByUsername(username);
    }

    @Override
    public String getUserIdByUsernameAndPassword(String username, String password) {
        return mvUserDao.getIdByUsernameAndPassword(username, password);
    }

    @Override
    public void deleteUserById(String userId) {
        mvUserDao.deleteById(userId);
    }

    @Override
    public MvUser getUserInfoById(String userId) {
        return mvUserDao.getUserInfoById(userId);
    }
}
