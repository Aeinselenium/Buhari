package com.aein.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest {
	@Test
	public void validation() {
		String data="selenium";
		String data1="selenium";
		
			//Assert.assertEquals(data, data1);
		Assert.assertEquals(13, 12, "both are not equal");
	}

}
