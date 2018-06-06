package com.adv.qa.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adv.qa.testBase.Testbase;

public class Homepage extends Testbase {
	
	String ploc;
	
	@FindBy(id="pickupValue")
	WebElement fromsearch;

	@FindBy(id="dropoffValue")
	WebElement rentsearch;
	
	@FindBy(id="adv_rez_submit")
	WebElement homepagesubmit;
	
	
	@FindBy(xpath="//img[contains (@class,'custom-logo')]")
	WebElement homepagelogo;
	
	@FindBy(id="ui-id-1")
	WebElement selec;
	
	@FindBy(xpath="//ul[@id='menu-secondary-menu']/li[4]/a")
	WebElement loginbutton;
	
	
	
	
	public Homepage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validtitlehomepage(){
		return driver.getTitle();
	}
	public boolean logoimage(){
		return homepagelogo.isDisplayed();
	}
	/*public void selecte(String ploc) throws Exception{
		fromsearch.clear();
		fromsearch.sendKeys(ploc);
		Thread.sleep(3000);
		List<WebElement> options =selec.findElements(By.tagName("li"));
		System.out.println(options.size());		
		for (int i = 1;i<=options.size(); i++) {
		WebElement pickList = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li["+i+"]/a"));
			if(pickList.getText().contains("- "+ploc)) {
				pickList.click();
				break;
			}
		} 
	}*/
	public void rentfrom(String rentf){
	fromsearch.sendKeys(rentf);
	}
	
	public void searchselect(){
		//fromsearch.sendKeys("lax");
		
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a")).click();
		
	}
	
	public void clickLoginButton() throws Exception{
		Thread.sleep(3000);
		loginbutton.click();
		
	}
	
/*	public void rentfrom(String rentf){
		fromsearch.sendKeys(rentf);
		
		
	}
	public void rentto(String renft){
		rentsearch.sendKeys(renft);
		}*/
		
	public void homesubmit(){
		homepagesubmit.click();
		
	}
	
	
}