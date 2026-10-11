package org.apache.catalina.startup;

import java.util.Scanner;
import java.util.ResourceBundle;
import jakarta.servlet.Servlet;

public class Bootstrap {
	public static void main(String[] args) throws Exception {
		System.out.println("Tomcat服务器启动成功， 开始接收用户请求...");
		ResourceBundle bundle = ResourceBundle.getBundle("web");
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("请输入请求路径：");
 			String url = s.next();
			String servletClassName = bundle.getString(url);
			Class clazz = Class.forName(servletClassName);
			Servlet servlet = (Servlet)clazz.newInstance();
			servlet.service();
		}
	}
}