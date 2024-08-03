package com.linkedin.service;

import com.linkedin.dao.LinedinDao;
import com.linkedin.dao.LinkedinDaointerface;
import com.linkedin.entity.Linkedinuser;

public class linkedinService implements LinkedinServiceinterface {
	 int i=0; 
	@Override
	public int createProfile(Linkedinuser lu) {
		
		LinkedinDaointerface ld=new LinedinDao();
		i=ld.createProfileDao(lu);
		return i;
	}

}
