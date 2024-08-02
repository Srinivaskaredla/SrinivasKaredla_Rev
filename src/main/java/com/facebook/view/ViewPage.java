package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.Controller;
import com.facebook.controller.ViewControllerInterface;

public class ViewPage extends Object {

	public static void main(String[] args) {
		
		System.out.println("Main Menu");
		System.out.println("press 1 to createProfile");
		System.out.println("press 2 to editProfile");
		System.out.println("press 3 to addProfile");
		System.out.println("press 4 to viewProfile");
		System.out.println("press 5 to viewAllProfile");
		System.out.println("press 6 to loginProfile");
		System.out.println("press 7 to searchProfile");
		
		System.out.println("Enter Choice");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		//view want to interact with Controller ,so it  must interact using low coupling i.e, via Interface
		
		ViewControllerInterface c =new Controller();
		
		switch(n) 
		{
		case 1:c.createProfile(); 
		break;
		case 2:c.editProfile();
		break;
		case 3:c.addProfile();
		break;
		case 4:c.viewProfile();
		break;
		case 5:c.viewAllProfile();
		break;
		case 6:c.loginProfile();
		break;
		case 7:c.searchProfile();
		break;
		}
		
	}

}
