package com.rifproject.method;

public class StaticMethodTest {
public static int   add(int a, int b) {
	
	int sum=a+b;
	return sum;
}
public static void main(String[] args) {
int res=	StaticMethodTest.add(20, 20);
	System.out.println(res);
	
}

}
