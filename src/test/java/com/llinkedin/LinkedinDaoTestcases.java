package com.llinkedin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.linkedin.dao.LinedinDao;
import com.linkedin.dao.LinkedinDaointerface;
import com.linkedin.entity.Linkedinuser;

public class LinkedinDaoTestcases {
	
	private LinkedinDaointerface ldao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Loading  of Testing Started 2 Dao ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Loading of Testing ended 2 Dao  ");
	}

	@Before
	public void setUp() throws Exception {
		ldao= new LinedinDao();
		
	}

	@After
	public void tearDown() throws Exception {
		ldao=null;
	}

	@Test
	public void testCreateProfileDao() {
		Linkedinuser lu=new  Linkedinuser();
		lu.setName("Ram");
		lu.setPassword("1122");
		lu.setEmail("rajesh@gmail.com");
		lu.setAddress("Bangalore");
		
		int i=ldao.createProfileDao(lu);
		assert i>0 :"profile not created";
	}
	@Test
	public void testViewProfiledao() {
		System.out.println("Not yet implemented");
	}

}
