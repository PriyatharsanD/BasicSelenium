package com.selenium.Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorAncestorDescendant {
	
	@Test
	public void ancestorTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		//div[contains(.,'Haier 596')]/ancestor::div[@class='col col-7-12']
	}
}