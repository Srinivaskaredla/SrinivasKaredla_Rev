package com.linkedin.dao;

import java.util.List;

import com.linkedin.entity.Linkedinuser;

public interface LinkedinDaointerface {

	int createProfileDao(Linkedinuser lu);

	Linkedinuser viewProfiledao(Linkedinuser lu);

	List<Linkedinuser> viewAllProfileDao();
	
	int deleteProfileDao(Linkedinuser lu);

	Linkedinuser LoginProfileDao(Linkedinuser lu);

	List<Linkedinuser> searchProfileDao(Linkedinuser lu);

	int editProfileDao(Linkedinuser lu);

}
