package com.linkedin.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.linkedin.entity.Linkedinuser;
import com.linkedin.service.LinkedinServiceinterface;
import com.linkedin.service.linkedinService;
import com.linkedin.utility.LinkedServiceDesignPattern;
import com.llinkedin.Exception.ProfileNotFoundException;

public class Linkedincontroller implements LinkedincontrollerInterface {
	Scanner scan=new Scanner(System.in);
	Logger log = Logger.getLogger("Linkedincontroller");
	Linkedinuser lu=new Linkedinuser();
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
		lu.setName(name);
		lu.setPassword(password);
		lu.setEmail(email);
		lu.setAddress(address);

		LinkedinServiceinterface ls =  LinkedServiceDesignPattern.createObject("user");
		
		int i=ls.createProfile(lu);
		System.out.println(i);
		
		if(i>0)
		{
			log.info("Profile Created at"+LocalDateTime.now());
		}
		else
		{
			log.error("Profile Rejected");
		}
	}
	@Override
	public void viewProfile () {
		System.out.println("Enter your Email");
		String email=scan.next();
		
		Linkedinuser lu=new Linkedinuser();
		lu.setEmail(email);
		
		LinkedinServiceinterface ls = new linkedinService();
		Linkedinuser ll=ls.viewProfile(lu);
		
		try {
		
		if(ll != null)
		{
			System.out.println("Your Profile is:");
			System.out.println("Name is ->"+ll.getName());
			System.out.println("Email is ->"+ll.getEmail());
			System.out.println("Password is ->"+ll.getPassword());
			System.out.println("Address is ->"+ll.getAddress());
		} 
		else
		{
			throw new ProfileNotFoundException("Profile is not found for this Email" + email);
		}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	@Override
	public void viewAllProfile() {
		LinkedinServiceinterface ls=new linkedinService();
		List<Linkedinuser> l1 =ls.viewAllProfileService();
		if(l1 !=null)
		{
			int i=0;
			for( Linkedinuser l3: l1)
			{
				i++;
				String na=l3.getName();
				String pw=l3.getPassword();
				String el=l3.getEmail();
				String as=l3.getAddress();
				
				System.out.println("Profile  is  " + i);
				System.out.println("*************************");
				System.out.println(na);
				System.out.println(pw);
				System.out.println(el);
				System.out.println(as);
				System.out.println("*******************************");
				
			}
		}
		
	}

	@Override
	public void deleteProfile() {
		System.out.println("Enter email to delete profile");
		String email=scan.next();
		
		Linkedinuser lu=new Linkedinuser();
		lu.setEmail(email);
		
	LinkedinServiceinterface ls=new linkedinService();
 int l1=ls.deleteProfileService(lu);
 if(l1>0)
 {
	 System.out.println("Profile deleted");
 }
	}
	
	@Override
	public void loginProfile() {
		System.out.println("Enter Your Email to login");
		String email=scan.next();
		
		System.out.println("Enter Your Password to login");
		String password=scan.next();
		
		LinkedinServiceinterface ls= new linkedinService();
		ls.loginProfileService(lu);
		
		if(lu.getEmail().equals(email))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
	
	@Override
	public void searchProfile() {
		System.out.println("Enter Your Name to Search");
		String name=scan.next();
		LinkedinServiceinterface lsi=new linkedinService();
		List<Linkedinuser> ll2=lsi.searchProfileService(lu);
		for(Linkedinuser l:ll2)
		{
		if(name.equals(l.getName()))
		{
			System.out.println("Your Profile is:");
			System.out.println("Name is ->"+l.getName());
			System.out.println("Email is ->"+l.getEmail());
			System.out.println("Password is ->"+l.getPassword());
			System.out.println("Address is ->"+l.getAddress());
			}
		}
	}
	
	@Override
	public void editProfile() {
		System.out.println("Enter Your  Email to edit profile");
		String email=scan.next();
		
		Linkedinuser lu=new Linkedinuser();
		lu.setEmail(email);
		
		LinkedinServiceinterface lsi=new linkedinService();
		 Linkedinuser ll=lsi.viewProfile(lu);
		 try {
			 if(ll!=null)
			 {
				 System.out.println("Your old profile is ");
					System.out.println("Name is -->"+ll.getName());
					System.out.println("Password is -->"+ll.getPassword());
					System.out.println("Email is --> "+ll.getEmail());
					System.out.println("Address is -->"+ll.getAddress());
					
					System.out.println("press 1 to change name");
					System.out.println("press 2 to change address");
					
					System.out.println("enter choice");
					int c=scan.nextInt();
					
					switch(c)
					{
					case 1:System.out.println("Enter new name");
					String newname=scan.next();
					ll.setName(newname);
					int i=lsi.editProfileService(ll);
					if(i>0)
					{
						System.out.println("name changed");
					}
					break;
					case 2:System.out.println("Enter new address");
					String naddress=scan.next();
					ll.setAddress(naddress);
					int i2=lsi.editProfileService(ll);
					if(i2>0) {
						System.out.println("Address changed");
					}
					break;
					default:System.out.println("Wrong choice");;
					}
			 }
			 else
			 {
				 throw new ProfileNotFoundException("Profile not found");
			 }
		 }
		catch(Exception e)
		 {
			System.out.println(e);
		 }
	}
}

