package org.bitm.SeleniumOnlineProject.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverManager {

	static {
		System.setProperty("webdriver.chrome.driver", "/Users/tanzim/Desktop/Selenium_Files/chromedriver");	
	}
	
	public static WebDriver driver = new ChromeDriver();
	
	private DriverManager() 
	{
		
	}
	
	
	// only to test this class
	//@Test
//	public void TestDriverManager()
//	{
//		System.out.print("all OK");
//	}

}
