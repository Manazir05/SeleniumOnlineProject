package org.bitm.SeleniumOnlineProject.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class TestNGTestClass {
	
	
	@Test
	public void TestDriverManager()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	
	public void TitleTest()
	{
		//String Hometitle = "Welcome! Mercury Tours";		
	}

}