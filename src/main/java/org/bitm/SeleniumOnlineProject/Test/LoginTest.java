package org.bitm.SeleniumOnlineProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.bitm.SeleniumOnlineProject.Utils.DriverManager;
import org.bitm.SeleniumOnlineProject.Utils.UrlTextUtils;
import org.bitm.SeleniumOnlineProject.Utils.XpathUtils;

public class LoginTest {
	
	private WebDriver driver = null;

	@Test(priority = 1)
	public void checkLoginPageTitle()
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_url);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
	}
	
	@Test(dependsOnMethods = "checkLoginPageTitle")
	public void loginTest()
	{
		driver.findElement(By.xpath(XpathUtils.LoginModule.user_name)).sendKeys("tutorial");
		driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys("tutorial");
		driver.findElement(By.xpath(XpathUtils.LoginModule.logIn_BTN)).click();
				
	}

}
