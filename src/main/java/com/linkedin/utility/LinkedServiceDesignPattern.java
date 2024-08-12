package com.linkedin.utility;

import com.linkedin.service.LinkedinServiceinterface;
import com.linkedin.service.linkedinService;

public class LinkedServiceDesignPattern {
	private static LinkedinServiceinterface ls=null;
	
	private LinkedServiceDesignPattern()
	{}
	public static LinkedinServiceinterface createObject(String ss)
	{
		if(ss.equals("user"))
		{
			if(ls == null)
			{
				ls = new linkedinService();
			}
		}
		return ls;
	}
}