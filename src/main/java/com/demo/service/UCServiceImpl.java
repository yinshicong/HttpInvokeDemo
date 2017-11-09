package com.demo.service;

import com.demo.dao.UserInfoDAO;
import com.demo.dto.UserInfo;
import com.demo.entity.UserInfoEntity;
import com.demo.utils.ApplicationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;

/**
 * Created by Max on 2017/3/9.
 */
@Service
public class UCServiceImpl implements UcService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    public UserInfo getUserInfobyName(String userName) {

        //模拟数据库返回值
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("aaa");
        userInfo.setEmail("123@qq.com");
        userInfo.setRegistDate(new Date());
        return  userInfo;

    }

    public int recordLog(String username, String point, String operate, String desc) {
        return 0;
    }

    public List<UserInfoEntity> getList(){

//        UserInfoDAO userDAO = (UserInfoDAO)ApplicationUtil.getBean("UserDAOProxy");
        List<UserInfoEntity> list = userInfoDAO.getList();
        return list;

    }

}
