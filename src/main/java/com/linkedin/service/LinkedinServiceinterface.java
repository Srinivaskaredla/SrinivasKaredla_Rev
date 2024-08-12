package com.linkedin.service;

import java.util.List;

import com.linkedin.entity.Linkedinuser;

public interface LinkedinServiceinterface {

	int createProfile(Linkedinuser lu);

	Linkedinuser viewProfile(Linkedinuser lu);

	List<Linkedinuser> viewAllProfileService();

	int deleteProfileService(Linkedinuser lu);

	Linkedinuser loginProfileService(Linkedinuser lu);

	List<Linkedinuser> searchProfileService(Linkedinuser lu);

	int editProfileService(Linkedinuser lu);
}
