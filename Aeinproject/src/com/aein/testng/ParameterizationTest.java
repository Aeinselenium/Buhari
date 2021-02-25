package com.aein.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest {
	@Test(dataProvider="getdata")
	public void login(String username, String password) {
		System.out.println("username is :"+username);
		System.out.println("passwordis : "+password);
	}
	@DataProvider
	public Object[][]getdata(){
		Object[][] data=new Object[2][2];
		data[0][0]="aein";
		data[0][1]="selenium";
		data[1][0]=	"aein1";
		data[1][1]="selenium1";
			return data;	
	}
}
