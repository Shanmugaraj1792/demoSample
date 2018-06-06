package com.adv.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.adv.qa.testBase.Testbase;

public class Loginpage extends Testbase {
	
	@FindBy(name="user_name")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement Password;
	
	@FindBy(xpath=".//*[@id='adv_login']/div[2]/button")
	WebElement loginsubmit;
	
	@FindBy(xpath="//span[contains(text(),'Log In To')]")
	WebElement verifyloginpagetitle;
	
	
@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
WebElement loginForgotPassword;




public boolean getlogintitle(){
	return loginForgotPassword.isDisplayed();
}


public void loginuser() throws Exception{
	
	Thread.sleep(3000);
	driver.findElement(By.name("user_name")).sendKeys("Ramkumar.v@quagilesolution.com");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("1234567");
	driver.findElement(By.xpath(".//*[@id='adv_login']/div[2]/button")).click();
}
	
	
}
