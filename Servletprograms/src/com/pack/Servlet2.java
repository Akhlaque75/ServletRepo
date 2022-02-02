package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	    {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out= response.getWriter())
		{
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Servlet2</title>");
			out.println("</head>");
			out.println("<body>");
			
			Cookie[]cookies=request.getCookies();
			boolean f=false;
			String name="";
			
			if(cookies==null)
			{
				out.print("<h1> you are new user go to home page and submit your name");
				return;
				
			}
			else {
				for(Cookie c:cookies) {
					String tname=c.getName();
					if(tname.equals("user_name"))
					{
						f=true;
						name=c.getValue();
					}	
				}
			}
			if(f)
			{
			
		    out.println("<h1> Hello,"+ name+ " welcome back to my website...</h1>");
			out.println("<h1>Thankyou</h1>");
			}else
			{
				out.print("<h1> you are new user go to home page and submit your name");
			}	
			out.println("</body>");
			out.println("</html>");
		 }
	    }
      }       

	


