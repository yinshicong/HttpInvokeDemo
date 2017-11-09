package com.demo.service;

import com.demo.dao.UserInfoDAO;
import com.demo.dto.StoreDto;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max on 2017/3/9.
 */
public class StoreServiceImpl implements StoreService {


    public List<StoreDto> getList() {

        List<StoreDto> result = new ArrayList<StoreDto>();
        StoreDto storeDto = new StoreDto();
        storeDto.setName("咖啡店");
        storeDto.setAddress("共和新路一号");
        result.add(storeDto);
        return result;

    }


    public int insertUsers() throws FileNotFoundException {


//        UserInfoDAO userDAO = (UserInfoDAO) factory.getBean("userDAO");
//        userDAO.insertUsers();
        return 1;

    }

}
