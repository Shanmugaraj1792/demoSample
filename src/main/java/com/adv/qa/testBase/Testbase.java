package com.adv.qa.testBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.adv.qa.util.Testunit;

public class Testbase {
	
	public static WebDriver driver;
	static Properties pro;

	
	
	public Testbase(){
		try{
		
		FileInputStream cp= new FileInputStream("C:/Eclipse/Selenium/Advantageproject/src/main/java/com/adv/qa/config/config.properties");
		pro=new Properties();
		pro.load(cp);
		
		}
		catch(Exception e){
			e.printStackTrace();
	}
	}
	public static void initalization() {
		String browsername=pro.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\user\\Desktop\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browsername.equals("edge")){
			System.setProperty("WebDriver.edge.driver", "./Advantageproject/MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testunit.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testunit.PAGE_IMPLICT_WAIT, TimeUnit.SECONDS);
		
		driver.get(pro.getProperty("url"));
		driver.findElement(By.xpath(".//*[@id='popmake-9018']/button")).click();
	
	}
	public void click(WebElement ele) {
		
		try {
		ele.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
		
	


