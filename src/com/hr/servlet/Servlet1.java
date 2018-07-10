package com.hr.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
//@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*读取一个参数
		PrintWriter out = response.getWriter();
		//获取ServletConfig对象
		ServletConfig config = this.getServletConfig();
		//获取参数名为encoding对应的参数值
		String param = config.getInitParameter("encoding");
		out.println("encoding的值为"+param);
		*/
		
		PrintWriter out = response.getWriter();
		ServletContext context = this.getServletContext();
		//获取相对路径中的输入流对象
		InputStream in = context.getResourceAsStream("/WEB-INF/classes/jdbc.properties");
		Properties pros = new Properties();
		pros.load(in);
		out.println("driver="+pros.getProperty("driver"));
		out.println("url="+pros.getProperty("url"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
