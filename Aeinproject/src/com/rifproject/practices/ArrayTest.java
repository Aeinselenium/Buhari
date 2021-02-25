package com.rifproject.practices;

import java.util.Iterator;

public class ArrayTest {

	
	public static void main(String[] args) {
		
		int []  a=new  int[5];
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		
		System.out.println("after inserting the values");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	 
		
	for (int i = 0; i < a.length; i++) {
		
		System.out.println(a[i]);
		
		for(int x:a) {
			System.out.println(x);
		}
			
		
	}
	
	}
	
}

		
		
	
		
		
		
		
	


