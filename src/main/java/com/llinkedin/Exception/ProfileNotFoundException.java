package com.llinkedin.Exception;

public class ProfileNotFoundException  extends Exception{
	String message;
	
	 public ProfileNotFoundException(String message)
	 {
		 this.message=message;
	 }
	 
	

	public String toString()
	 {
		return "ha ha i am an Exception"+message;
		 
	 }
}
