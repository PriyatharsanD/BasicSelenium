package com.selenium.webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verification {
	@Test
	public void verificationTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Is Selected
		WebElement radio = driver.findElement(By.id("pollanswers-2"));
		radio.click();
		System.out.println(radio.isSelected());
		System.out.println(radio.isEnabled());//Radio Button is iteractable
		System.out.println(radio.isDisplayed());
		
		driver.close();
		
	}

}
