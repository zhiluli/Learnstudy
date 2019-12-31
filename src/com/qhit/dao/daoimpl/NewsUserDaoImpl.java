package com.qhit.dao.daoimpl;

import com.qhit.dao.BaseDao;
import com.qhit.dao.NewsUserDao;
import com.qhit.entity.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NewsUserDaoImpl extends BaseDao implements NewsUserDao {
    @Override
    public boolean isLogin(String uname, String upwd) {
        boolean isflag=false;
        List<User> list=new ArrayList<>();
        String sql="select * from user where uname=? and upwd=?";
        Object[] obj={uname,upwd};
        ResultSet query=query(sql,obj);
        User user=null;
        try {
            while (query.next()){
                user=new User();
               user.setUid(query.getInt("uid"));
               user.setUname(query.getString("uname"));
               user.setUpwd(query.getString("upwd"));
               list.add(user);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        if(list.size()>0){
            isflag=true;
        }
        return isflag;
    }
}
