package com.orangehrm.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com.Orangelive.Pages.LoginPage;
import Com.qa.TestBaseDemo.Testbase;

public class loginTestPages extends Testbase
{
	LoginPage loginpage;
	public loginTestPages()
	{
	super();	
	}
	@BeforeSuite
	public void setUp()
	{
		initialization();
		loginpage =new LoginPage();
	}
	@Test
	public void verifyTitleTest()
	{
		String title =loginpage.verifyTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	public void verifyLoginTest()
	{
		loginpage.verifyLogin();
		
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	

}
