package com.util;

import java.sql.*;


public class DbConnection {
  private static String Driver="com.mysql.jdbc.Driver";
  private static String URL="jdbc:mysql://localhost:3306/jsoft?characterEncoding=latin1";
  private static String USER="root";
  private static String PASSWORD="root";
  
  public static Connection get_connecton() {
	  Connection con=null;
	  try {
		  Class.forName(Driver);
		  con=DriverManager.getConnection(URL,USER,PASSWORD);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return con;
    }
  }
