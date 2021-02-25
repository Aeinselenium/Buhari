package com.rifproject.practices;

import java.util.ArrayList;
import java.util.List;

public class ListObjectTest {

	public static void main(String[] args) {
		
		
		
		List<Object>  l=new  ArrayList<>();
		
		l.add("selenium");
		l.add(1.1);
		
		for (Object item : l) {
			
			
			System.out.println(item);
			
		}
	}

}
