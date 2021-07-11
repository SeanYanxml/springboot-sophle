package com.yanxml.java.springboot.sophle.standard.dao.impl;

import com.yanxml.java.springboot.sophle.standard.dao.IUserDao;
import com.yanxml.java.springboot.sophle.standard.domain.bo.UserBO;
import com.yanxml.java.springboot.sophle.standard.domain.entity.UserDO;
import org.springframework.context.annotation.Configuration;

/**
* UserDao 层.
* Author: sean
* Date:May 24, 202112:41:46 AM
*/

@Configuration
public class UserDaoImpl implements IUserDao{

    public UserDO getByName(String name) {
        return new UserDO();
    }
}
