package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void loginTest() throws IOException {
		

	driver.get(baseURL);
	
	logger.info("url is opened");
	
	LoginPage lp = new LoginPage(driver);
	lp.setUsername(username);
	logger.info("username is entered");
	
	lp.setPassword(password);
	logger.info("password is entered");
	
	lp.clickButton();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage12"))
	{
		Assert.assertTrue(true);
		logger.info("login test passed");
		
	}
	else
	{
		
		captureScreen(driver, "loginTest");
		Assert.assertTrue(false);
		logger.info("login test failed");
		
	}
	
	}
}
