package com.yanxml.java.springboot.sophle.standard.service.impl;

import com.yanxml.java.springboot.sophle.standard.dao.IUserDao;
import com.yanxml.java.springboot.sophle.standard.domain.bo.UserBO;
import com.yanxml.java.springboot.sophle.standard.domain.entity.UserDO;
import com.yanxml.java.springboot.sophle.standard.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* Author: sean
* Date:May 24, 202112:41:09 AM
*/

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public UserBO getByName(String name) {
        UserDO userDO = userDao.getByName("");
        // transfer  userDO --> userBO
        return new UserBO();
    }
}
