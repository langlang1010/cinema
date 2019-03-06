package cn.smileyan.movie.service.common.impl;

import cn.smileyan.movie.dao.MvOaDao;
import cn.smileyan.movie.entity.MvOa;
import cn.smileyan.movie.service.common.OaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OaServiceImpl implements OaService {
    @Autowired
    private MvOaDao mvOaDao;
    @Override
    public MvOa getById(String oAid) {
        System.out.println("OaServiceImpl");
        return mvOaDao.getById(oAid);
    }
}
