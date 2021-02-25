package com.aein.testng;

import org.testng.annotations.Test;

public class MultipleTestNG {
@Test(priority=0,enabled = false)
public void applaunch() {
	System.out.println("applaunch");
}
@Test(priority=2)
public void applogin() {
	System.out.println("applogin");
}
@Test
public void applogout() {
	System.out.println("applogout");
}
@Test
public void appclose() {
	System.out.println("appclose");
}
}
