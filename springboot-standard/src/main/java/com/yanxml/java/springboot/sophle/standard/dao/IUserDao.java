package com.yanxml.java.springboot.sophle.standard.dao;

import com.yanxml.java.springboot.sophle.standard.domain.bo.UserBO;
import com.yanxml.java.springboot.sophle.standard.domain.entity.UserDO;

/**
*
* Author: sean
* Date:May 24, 202112:41:30 AM
*/

public interface IUserDao {

    public UserDO getByName(String name);

}
