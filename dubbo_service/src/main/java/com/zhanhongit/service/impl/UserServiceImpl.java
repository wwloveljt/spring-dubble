package com.zhanhongit.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhanhongit.service.UserService;

public class UserServiceImpl implements UserService {

	public String getUserId(Integer id) {
		System.out.println(" 琚鎴风锛堟秷璐硅�咃級娑堣垂銆傘�傘�傘�傘��");
		if (id == 1) {
			return "lv1";
		} else if (id == 2) {
			return "lv2";

		} else if (id == 3) {
			return "lv3";

		} else if (id == 4) {
			return "lv4";
		}
		return "涓烘壘鍒�";
	}

}
