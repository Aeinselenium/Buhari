package com.aein.testng;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest2 {
	@Test
	public void testmethod3(){
		System.out.println("TestMethod3 Executed");
	}
	@Test
	public void testmethod4() {
		System.out.println("TestMethod4 Executed");
	}
	@BeforeTest
	public void beforemethod() {
		System.out.println("BeforeTest Executed");
	}
		@AfterTest
		public void aftermethod() {
			System.out.println("AfterTest Executed");
	}
		
		}

