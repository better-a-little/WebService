package com.zc;

import javax.xml.ws.Endpoint;

import com.zc.service.impl.UserServiceImpl;

public class TestMain {
	
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8989/WebServiceDemo/UserServiceImpl", new UserServiceImpl());
		System.out.println("服务部署成功");
	}

}
