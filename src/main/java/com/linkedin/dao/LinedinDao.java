package com.linkedin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.linkedin.entity.Linkedinuser;

public class LinedinDao implements LinkedinDaointerface {

	@Override
	public int createProfileDao(Linkedinuser lu) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement psms =con.prepareStatement("insert into`revProject` values(?,?,?,?)");
			psms.setString(1,lu.getName());
			psms.setString(2, lu.getPassword());
			psms.setString(3, lu.getEmail());
			psms.setString(4, lu.getAddress());
			psms.executeUpdate();
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		} 
		return 0;
	}

}
