package com.demo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Max on 2017/3/9.
 */
public class UserInfo implements Serializable{

    /** 用户名 */
    private String userName ;

    /** 电子邮箱 */
    private String email ;

    /** 注册日期 */
    private Date registDate ;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }
}
