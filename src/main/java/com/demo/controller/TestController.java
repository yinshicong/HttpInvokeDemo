package com.demo.controller;

import com.demo.entity.UserInfoEntity;
import com.demo.service.UcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Max on 2017/3/9.
 */
@Controller
public class TestController {

    @Autowired
    private UcService ucService;

    @RequestMapping("test")
    public String test(){
        List<UserInfoEntity> entities =  ucService.getList();
        System.out.println(entities);
        return "test";
    }

}
