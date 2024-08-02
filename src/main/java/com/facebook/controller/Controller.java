package com.facebook.controller;

import java.util.Scanner;

import com.facebook.entity.facebookuser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class Controller implements ViewControllerInterface {

	@Override
	public void createProfile() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scan.next();
		
		System.out.println("Enter password");
		String password=scan.next();
		
		System.out.println("Enter email");
		String email=scan.next();
		
		System.out.println("Enter Address");
		String address=scan.next();
		
		facebookuser fu=new facebookuser();
		fu.setName(name);
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);

		FacebookServiceInterface fi= new FacebookService();
		
		int i = fi.createProfileService(fu);
		
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
	public void editProfile() {
		
	}

	@Override
	public void addProfile() {
		
	}

	@Override
	public void viewProfile() {
		
	}

	@Override
	public void viewAllProfile() {
		
	}

	@Override
	public void loginProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

}
