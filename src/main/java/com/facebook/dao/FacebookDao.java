package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.facebook.entity.facebookuser;

public class FacebookDao implements FacebookDaoInterface {
	@Override
	public int createProfileDao(facebookuser fu) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature","root","Srinivas@143");
			PreparedStatement ps = con.prepareStatement("insert into `revProject` values(?,?,?,?)");
			ps.setString(1, fu.getName());
			ps.setString(2, fu.getEmail());
			ps.setString(3, fu.getPassword());
			ps.setString(4, fu.getAddress());
			ps.executeUpdate();
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}		return 0;
	}
	}

