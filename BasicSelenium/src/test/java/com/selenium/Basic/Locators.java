package com.selenium.Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	@Test
	public void locators()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement id = driver.findElement(By.id("small-searchterms"));
		WebElement name = driver.findElement(By.name("q"));
		WebElement className = driver.findElement(By.className("bar-notification"));
		List<WebElement> tagName = driver.findElements(By.tagName("input"));
		WebElement linkText = driver.findElement(By.linkText("Register"));
		WebElement login = driver.findElement(By.partialLinkText("Log"));
		WebElement xpath = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		WebElement cssSelector = driver.findElement(By.cssSelector("input[id='newsletter-subscribe-button']"));
		driver.close();
	}

}
