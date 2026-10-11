package com.jkweilai.servlet;

import jakarta.servlet.Servlet;

public class DeptDeleteServlet implements Servlet {
	public void service() {
		System.out.println("正在删除部门信息...");
	}
}