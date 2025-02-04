package com.selenium.jsExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PassValueAndclick {
	@Test
	public void PassValueAndclick()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		WebElement searchButton = driver.findElement(By.xpath("//input[contains(@class,'button-1') and contains(@value,'Search')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Laptop'",searchField);
		js.executeScript("arguments[0].click()",searchButton);
		driver.close();
	}

}
