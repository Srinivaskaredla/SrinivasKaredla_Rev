package com.llinkedin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedinServiceTestcases {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Loading Service Tests 1 Service");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Unloading Service Tests 1 Service");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateProfile() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testViewProfile() {
		System.out.println("Not yet implemented");
	}

}
