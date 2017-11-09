package com.demo.dao;

import com.demo.entity.UserInfoEntity;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Max on 2017/3/10.
 */
@Repository
public interface UserInfoDAO {

    List<UserInfoEntity> getList();

}
