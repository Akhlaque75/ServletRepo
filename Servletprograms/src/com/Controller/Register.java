package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.InsertDao;
import com.daoImp.InsertDaoImp;
import com.pojo.Userbean;


public class Register extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     response.sendRedirect("signup.jsp");
		PrintWriter out=response.getWriter();
		
		InsertDao id=new InsertDaoImp();
		
		String name=request.getParameter("user_name");
		String password=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		
		Userbean ub=new Userbean();
		ub.setName(name);
		ub.setPassword(password);
		ub.setEmail(email);
		id.insertValues(ub);
	
	out.println(name+" "+password+" "+email);
	
	}
}
