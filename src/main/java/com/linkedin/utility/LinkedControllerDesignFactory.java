package com.linkedin.utility;

import com.linkedin.controller.Linkedincontroller;
import com.linkedin.controller.LinkedincontrollerInterface;

public class LinkedControllerDesignFactory {
	
	private LinkedControllerDesignFactory()
	{

	}
	public static  LinkedincontrollerInterface createObject(String ss)
	{
		if(ss.equals("user"))
		{
			return new Linkedincontroller();
			
		}
		return null;
	}
}
