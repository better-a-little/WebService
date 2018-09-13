package com.zc.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.zc.service.UserService;

@WebService
public class UserServiceImpl implements UserService {

	@Override
	public String getNewString(String value) {
		return "WebService" + value;
	}

	@Override
	public String getName(String value) {
		return "王小飞";
	}
	
	@WebMethod(exclude = true)
	@Override
	public void getSum(String value) {
		System.out.println("exclude = true");
	}
	
//	静态方法、final修饰的方式不能发布，且方法上不能@WebMethod
	public static void getStatic(){
		System.out.println("静态方法");
	}

}
