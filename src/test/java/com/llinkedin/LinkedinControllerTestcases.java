package com.llinkedin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.linkedin.controller.Linkedincontroller;
import com.linkedin.controller.LinkedincontrollerInterface;
import com.linkedin.utility.LinkedControllerDesignFactory;

public class LinkedinControllerTestcases {

	private  LinkedincontrollerInterface li;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Loading the test cycle 1 Controller ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("Unloading the test Cycle 1 Controller " );
	}

	@Before
	public void setUp() throws Exception {
		
		li=LinkedControllerDesignFactory.createObject("user");
	}

	@After
	public void tearDown() throws Exception {
		li=null;
	}

	@Test
	public void test() {
		System.out.println("Not yet implemented");
	}

}
