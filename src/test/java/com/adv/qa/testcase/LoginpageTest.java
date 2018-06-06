package com.adv.qa.testcase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.adv.qa.pages.Homepage;
import com.adv.qa.pages.Loginpage;
import com.adv.qa.testBase.Testbase;
import com.adv.qa.util.Testunit;

public class LoginpageTest extends Testbase {
	
	Homepage homepage;
	Loginpage loginpage;
	
	
	
	public LoginpageTest(){
		super();
	}

	@BeforeMethod
	
	public void setup() {
		initalization();
		 homepage= new Homepage();
		 loginpage=new Loginpage();
		 
	}
	@Test
	public void logindisplay() throws Exception {
		
		
		homepage.clickLoginButton();
		Thread.sleep(3000);
		loginpage.loginuser();
		
	}
	
}
