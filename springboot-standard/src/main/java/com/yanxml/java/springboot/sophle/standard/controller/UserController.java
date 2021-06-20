package com.yanxml.java.springboot.sophle.standard.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yanxml.java.springboot.sophle.standard.domain.request.QueryUserRequest;
import com.yanxml.java.springboot.sophle.standard.domain.request.UserBaseRequest;
import com.yanxml.java.springboot.sophle.standard.domain.response.CommonResponse;
import com.yanxml.java.springboot.sophle.standard.domain.vo.UserVO;

/**
* Base Controller.
* Author: sean
* Date:May 24, 202112:42:24 AM
*/

@RestController(value="/user")
public class UserController {
	
	@RequestMapping(path="/insert", method = RequestMethod.POST)
	public CommonResponse<String> insert(@RequestBody UserBaseRequest request){
		return null;
	}
	
	@RequestMapping(path="/get", method = RequestMethod.GET)
	public CommonResponse<String> get(@RequestParam long userId){
		return null;
	}
	
	@RequestMapping(path="/search" , method = RequestMethod.POST)
	public CommonResponse<List<UserVO>> search(@RequestBody QueryUserRequest request){
		return null;
	}
	
	@RequestMapping(path="/update", method = RequestMethod.POST)
	public CommonResponse<Void> update(@RequestBody UserBaseRequest request){
		return null;
	}

	@RequestMapping(path="/delete", method = RequestMethod.POST)
	public CommonResponse<Void> delete(@RequestParam long userId){
		return null;
	}
}
