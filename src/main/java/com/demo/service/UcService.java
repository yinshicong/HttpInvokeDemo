package com.demo.service;

import com.demo.dto.UserInfo;
import com.demo.entity.UserInfoEntity;

import java.util.List;

/**
 * Created by Max on 2017/3/9.
 */
public interface UcService {

    UserInfo getUserInfobyName(String userName);

    int recordLog(String username, String point, String operate, String desc);

    List<UserInfoEntity> getList();

}
