package com.aein.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest1 {
	@Test
	public void testmethod1(){
		System.out.println("TestMethod1 Executed");
	}
	@Test
	public void testmethod2() {
		System.out.println("TestMethod2 Executed");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BeforeMethod Executed");
	}
		@AfterMethod
		public void aftermethod() {
			System.out.println("AfterMethod Executed");
	}
		@BeforeClass
		public void beforeclass() {
			System.out.println("BeforeClass Executed");
		}	
		@AfterClass
		public void afterclass() {
			System.out.println("AfterClass Executed");
		}

}
