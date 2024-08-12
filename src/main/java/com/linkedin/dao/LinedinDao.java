package com.linkedin.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.linkedin.entity.Linkedinuser;

public class LinedinDao implements LinkedinDaointerface {
	ResultSet res=null;
	@Override
	public int createProfileDao(Linkedinuser lu) {
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement psms =con.prepareStatement("insert into`revProject` values(?,?,?,?)");
			psms.setString(1, lu.getName());
			System.out.println(lu.getName());
			psms.setString(2, lu.getPassword());
			psms.setString(3, lu.getEmail());
			psms.setString(4, lu.getAddress());
			i=psms.executeUpdate();
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		} 
		return i;
	}

	@Override
	public Linkedinuser viewProfiledao(Linkedinuser lu) {
		Linkedinuser l2 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement psms=con.prepareStatement("Select * from `revProject` where email=?");
			psms.setString(1, lu.getEmail());
			ResultSet res= psms.executeQuery();
			while(res.next())
			{
				String n=res.getString("name");
				String p=res.getString("password");
				String e=res.getString("email");
				String a=res.getString("address");
			
			l2=new Linkedinuser();
			lu.setName(n);
			lu.setPassword(p);
			lu.setEmail(e);
			lu.setAddress(a);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return lu;
	}
	
	@Override
	public List<Linkedinuser> viewAllProfileDao() {
		List<Linkedinuser> ll2=new ArrayList<Linkedinuser>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement psms=con.prepareStatement("select * from revproject");
			res=psms.executeQuery();
			while(res.next())
			{
				String n = res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				Linkedinuser l3=new Linkedinuser();
				
				l3.setName(n);
				l3.setPassword(p);
				l3.setEmail(e);
				l3.setAddress(a);
				ll2.add(l3);
				
			}
		} catch (ClassNotFoundException |SQLException e) {
		}
		return ll2;
	}

	@Override
	public int deleteProfileDao(Linkedinuser lu) {
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement psms=con.prepareStatement("delete from `revproject` where email = ?");
			psms.setString(1,lu.getEmail());
			 i=psms.executeUpdate();
			 System.out.println(i);
		} catch (ClassNotFoundException |SQLException e) {
	}
		return i;
}

	@Override
	public Linkedinuser LoginProfileDao(Linkedinuser lu) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement psms = con.prepareStatement("select * from `revproject` where name=?");
			psms.setString(1, lu.getName());
			ResultSet res = psms.executeQuery();
			
			while(res.next())
			{
				String nam =res.getString(1);
				String pwd =res.getString(2);
				String ema =res.getString(3);
				String addr =res.getString(4); 
				
				Linkedinuser user=new Linkedinuser();
				user.setName(nam);
				user.setPassword(pwd);
				user.setEmail(ema);
				user.setAddress(addr);
			}
		} catch (ClassNotFoundException |SQLException e) {
		}
		return lu;
	}

	@Override
	public List<Linkedinuser> searchProfileDao(Linkedinuser lu) {
		List<Linkedinuser> ll3=new ArrayList<Linkedinuser>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement psms=con.prepareStatement("select * from revproject");
			res=psms.executeQuery();
			while(res.next())
			{
				String na = res.getString(1);
				String pa=res.getString(2);
				String em=res.getString(3);
				String ad=res.getString(4);
				
				Linkedinuser l4=new Linkedinuser();
				
				l4.setName(na);
				l4.setPassword(pa);
				l4.setEmail(em);
				l4.setAddress(ad);
				ll3.add(l4);
			}
		} catch (ClassNotFoundException |SQLException e) {
		}
		return ll3;
	}

	@Override
	public int editProfileDao(Linkedinuser lu) {
		int i=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement psms=con.prepareStatement("update `revproject` set name=?,address=? where email=?");
			psms.setString(1,lu.getName());
			psms.setString(2,lu.getAddress());
			psms.setString(3,lu.getEmail());
			i=psms.executeUpdate();
			System.out.println("i value is"+ i );
		} catch (ClassNotFoundException |SQLException e) {
	  }
		return i;
	}
	
	
}
