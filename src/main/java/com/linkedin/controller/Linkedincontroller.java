package com.linkedin.controller;

import java.util.Scanner;

import com.linkedin.entity.Linkedinuser;
import com.linkedin.service.LinkedinServiceinterface;
import com.linkedin.service.linkedinService;

public class Linkedincontroller implements LinkedincontrollerInterface {
	Scanner scan=new Scanner(System.in);
	int i=0;

	@Override
	public void createProfile() {
		System.out.println("Enter Name");
		String name=scan.next();
		
		System.out.println("Enter Password");
		String password=scan.next();
		
		System.out.println("Enter Email");
		String email=scan.next();
		
		System.out.println("Enter Address");
		String address=scan.next();
		
		Linkedinuser lu=new Linkedinuser();
		LinkedinServiceinterface ls = new linkedinService();
		i=ls.createProfile(lu);
		if(i>0)
		{
			System.out.println("Profile Created");
		}
		else
		{
			System.out.println("Profile Rejected");
		}
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfile() {
		// TODO Auto-generated method stub
		
	}

}
