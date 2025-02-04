package com.selenium.Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsFunctions {
	@Test
	public void locatorsTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement contains1 = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		WebElement contains2 = driver.findElement(By.xpath("//a[starts-with(@class,'ico-re')]"));
		WebElement startsWith = driver.findElement(By.xpath("//a[starts-with(text(),'Register')]"));
		WebElement endsWith = driver.findElement(By.xpath("//a[ends-with(text(),'ster')]"));
		driver.close();
	}

}
