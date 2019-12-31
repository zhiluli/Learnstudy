package com.qhit.service.serviceImpl;

import com.qhit.dao.NewsUserDao;
import com.qhit.dao.daoimpl.NewsUserDaoImpl;
import com.qhit.service.NewsUsersService;

public class NewsUsersServiceImpl implements NewsUsersService {

    NewsUserDao userDao=new NewsUserDaoImpl();
    public boolean checkLogin(String uname, String upwd) {
        return userDao.isLogin(uname,upwd);
    }
}
