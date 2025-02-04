package com.selenium.Synchronization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	@Test
	public void explicitTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		wait.until(ExpectedConditions.visibilityOf(searchField));
		searchField.sendKeys("iphone");
		searchField.submit();
		
		
	}

}
