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

	public CommonResponse(T data){
		this.data = data;
	}

	public CommonResponse<T> success(){
		this.code = "200";
		this.description = "success";
		return this;
	}

	public CommonResponse<T> error(){
		this.code = "400";
		this.description = "error";
		return this;
	}
}
