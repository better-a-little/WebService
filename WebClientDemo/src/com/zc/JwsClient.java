package com.zc;

import com.zc.service.impl.UserServiceImpl;
import com.zc.service.impl.UserServiceImplService;

public class JwsClient {
	
	public static void main(String[] args) {
		
		UserServiceImpl userServiceImpl = new UserServiceImplService().getUserServiceImplPort();
		String name = userServiceImpl.getName("123");
		String newString = userServiceImpl.getNewString("666");
		System.out.println(name);
		System.out.println(newString);
	}

}
