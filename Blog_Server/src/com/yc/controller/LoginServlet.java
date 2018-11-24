package com.yc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.yc.DBHelper;
import com.yc.bean.User;
import com.yc.biz.BizException;
import com.yc.biz.UserBiz;

/**
 * Servlet implementation class LoginServlet
 * */

@WebServlet("/login.s")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		//接收参数
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		
		UserBiz ubiz = new UserBiz();
		//Map<String, String> user =ubiz.login(username,userpwd);
		User user = null;
		 try{
			 user = ubiz.login(username, userpwd); 
		 }catch (BizException e){
			 e.printStackTrace();
			 request.setAttribute("msg", e.getMessage());
			 //失败
			 request.getRequestDispatcher("login.jsp").forward(request, response);
			 return;
		 }
		if (user == null ) {
			request.setAttribute("msg", "用户或密码错误!");
			//失败
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}else {
			//将用户信息保存到会话中
			request.getSession().setAttribute("loginedUser", user);
			//成功
			response.sendRedirect("index.jsp");
		}
		
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		doGet(request, response);
	}

}
