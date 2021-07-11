package com.yanxml.java.springboot.sophle.standard.service;

import com.yanxml.java.springboot.sophle.standard.dao.IUserDao;
import com.yanxml.java.springboot.sophle.standard.domain.bo.UserBO;

import javax.xml.ws.Action;

/**
*
* Author: sean
* Date:May 24, 202112:40:51 AM
*/

public interface IUserService {

    UserBO getByName(String name);

}
