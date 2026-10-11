package com.jkweilai.servlet;

import jakarta.servlet.Servlet;

public class LoginServlet implements Servlet {
	public void service() {
		System.out.println("正在处理用户登录请求...");
	}

}