package com.TestNg.Suites;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGScript {
	
@Test
	public void loginapplication(){
		System.out.println("here we are login the application");
		Assert.assertEquals(12, 13);
	}
@Test
	public void Details(){
		System.out.println("here we are providing the details");
	}
@Test
	public void Complete(){
		System.out.println("We are done");
	}
}
