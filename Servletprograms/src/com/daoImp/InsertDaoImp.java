package com.daoImp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.dao.InsertDao;
import com.mysql.jdbc.ResultSet;
import com.pojo.Userbean;
import com.util.DbConnection;

public class InsertDaoImp implements InsertDao {

	@Override
	public void insertValues(Userbean userbean) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			String query="insert into user(name,password,email) values(?,?,?)";
			con=DbConnection.get_connecton();
			ps=con.prepareStatement(query);
			ps.setString(1,userbean.getName());
			ps.setString(2,userbean.getPassword());
			ps.setString(3,userbean.getEmail());
			int i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Userbean> getValues() {
		Connection con=null;
		PreparedStatement ps=null;
		List<Userbean> list=new ArrayList<Userbean>();
		java.sql.ResultSet rs=null;
		try {
			String query="select * from user";
			con=DbConnection.get_connecton();
			ps= con.prepareStatement(query);
			rs=ps.executeQuery();
			Userbean ubean=null;
			  while(rs.next()){
				  ubean=new Userbean();
				  ubean.setName(rs.getString("name"));
				  ubean.setPassword(rs.getString("password"));
				  ubean.setEmail(rs.getString("email"));
				  list.add(ubean);  
			  } 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
	
	
  

