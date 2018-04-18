package com.zhanhongit.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhanhongit.service.UserService;

public class ProviderTest {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
		context.start();
		UserService userService = (UserService) context.getBean("UserService");
		System.out.println(userService.getUserId(2));
	}
}
