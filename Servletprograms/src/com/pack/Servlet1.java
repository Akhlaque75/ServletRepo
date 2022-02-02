package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out= resp.getWriter()){
			
		PrintWriter out1= resp.getWriter();
		out1.println("<!DOCTYPE html>");
		out1.println("<html>");
		out1.println("<head>");
		out1.println("<title>Servlet Servlet1</title>");
		out1.println("</head>");
		out1.println("<body>");
		
		String name=req.getParameter("name");
		out1.println("<h1> Hello,"+ name+ " welcome to my website...</h1>");
		out1.println("<h1><a href=servlet2>Go to Servlet 2</a></h1>");
		
		Cookie c=new Cookie("user_name", name);
		resp.addCookie(c);
		
		
		out1.println("</body>");
		out1.println("</html>");
	}    
  }
}
