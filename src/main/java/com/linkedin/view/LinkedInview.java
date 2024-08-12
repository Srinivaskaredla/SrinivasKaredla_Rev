package com.linkedin.view;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;
import com.linkedin.controller.Linkedincontroller;
import com.linkedin.controller.LinkedincontrollerInterface;
import com.linkedin.utility.LinkedControllerDesignFactory;

public class LinkedInview {

	private static Logger log =Logger.getLogger("LinkedInview");	public static void main(String[] args) {
		String ss="y";
		Scanner scan = new Scanner(System.in);
		while (ss.equals("y")){
		System.out.println("************Main Menu************");
		System.out.println("Press 1 to Create Profile");
		System.out.println("Press 2 to View  Profile");
		System.out.println("Press 3 to ViewAllProfile");
		System.out.println("Press 4 to Delete Profile");
		System.out.println("Press 5 to Login Profile");
		System.out.println("Press 6 to Search Profile");
		System.out.println("Press 7 to Edit Profile");
		
		System.out.println("Enter Your Response");
		int n =scan.nextInt();
		
		LinkedincontrollerInterface lc = LinkedControllerDesignFactory.createObject("user");
		
		switch(n)
		{
			case 1:lc.createProfile();
			break;
			case 2:lc.viewProfile();
			break;
			case 3:lc.viewAllProfile();
			break;
			case 4:lc.deleteProfile();
			break;
			case 5:lc.loginProfile();
			break;
			case 6:lc.searchProfile();
			break;
			case 7:lc.editProfile();
			break;
				default:System.out.println("Wrong Choice");
		}
		System.out.println("Press y to continue");
		ss=scan.next();
	}
	}
}
