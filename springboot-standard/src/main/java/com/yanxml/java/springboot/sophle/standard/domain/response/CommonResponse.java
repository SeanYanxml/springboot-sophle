package com.yanxml.java.springboot.sophle.standard.domain.response;

import lombok.Data;

/**
* 通用返回值封装.
* 
* Author: sean
* Date:May 24, 202112:35:18 AM
* @param <T>
*/
@Data
public class CommonResponse<T> {
	
	String description;
	
	String code;
	
	T data;
	
}
