package com.linkedin.service;

import java.util.List;

import com.linkedin.dao.LinedinDao;
import com.linkedin.dao.LinkedinDaointerface;
import com.linkedin.entity.Linkedinuser;

public class linkedinService implements LinkedinServiceinterface {
	 int i=0; 
	@Override
	public int createProfile(Linkedinuser lu)
	{
		LinkedinDaointerface ld = new LinedinDao();
		i=ld.createProfileDao(lu);
		return i;
	}
	@Override
	public Linkedinuser  viewProfile(Linkedinuser lu) 
	{
		LinkedinDaointerface ld=new LinedinDao();
		return ld.viewProfiledao(lu);
	}
	@Override
	public List<Linkedinuser> viewAllProfileService() 
	{
		LinkedinDaointerface ld1=new LinedinDao();
			return ld1.viewAllProfileDao();
	}
	@Override
	public int deleteProfileService(Linkedinuser lu) 
	{
		LinkedinDaointerface ld1=new LinedinDao();
		return ld1.deleteProfileDao(lu);
		
	}
	@Override
	public Linkedinuser loginProfileService(Linkedinuser lu) 
	{
		LinkedinDaointerface ld=new LinedinDao();
		return ld.LoginProfileDao(lu);
	}
	@Override
	public List<Linkedinuser> searchProfileService(Linkedinuser lu) {
		LinkedinDaointerface ld=new LinedinDao();
		return ld.searchProfileDao(lu) ;
	}
	@Override
	public int editProfileService(Linkedinuser lu) {
		LinkedinDaointerface ldi=new LinedinDao();
		return ldi.editProfileDao(lu);
	}
}
