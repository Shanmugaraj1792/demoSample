package com.adv.qa.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adv.qa.pages.Homepage;
import com.adv.qa.testBase.Testbase;

public class Homepagetest extends Testbase  {
	Homepage homepage;
	
	public Homepagetest(){
		super();
	}
	
	@BeforeMethod
	
	public void setup() {
		initalization();
		 homepage= new Homepage();
		 
	}
	
	@Test(priority=1)
	public void title(){
		String title1=homepage.validtitlehomepage();
		Assert.assertEquals(title1, "Car Rental Near Me | Advantage Rent A Car");
	}
	@Test(priority=2)
	public void image(){
		boolean flag=homepage.logoimage();
		Assert.assertTrue(flag);
		}
	
	
	
@Test(priority=3)
public void from() throws Exception{
//homepage.selecte("lax");
	homepage.rentfrom("lax");
homepage.searchselect();
homepage.homesubmit();
}
	
	
	/*@AfterMethod
		
	public void down(){
		driver.quit();
	}*/

}
