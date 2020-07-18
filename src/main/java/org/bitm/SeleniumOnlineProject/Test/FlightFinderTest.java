package org.bitm.SeleniumOnlineProject.Test;

import org.bitm.SeleniumOnlineProject.Utils.DriverManager;
import org.bitm.SeleniumOnlineProject.Utils.UrlTextUtils;
import org.bitm.SeleniumOnlineProject.Utils.XpathUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightFinderTest {
	
	private WebDriver driver = null;

	@Test
	public void checkFlightFinderPageTitle()
	{
		driver = DriverManager.driver;
		//driver.get(UrlTextUtils.URL.Base_url);
		//Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
	}
	
	@Test
	public void flightFinderTest()
	{
		driver.findElement(By.xpath(XpathUtils.FlightFinderModule.OneWay_BTN)).click();
	}
	
	

}
