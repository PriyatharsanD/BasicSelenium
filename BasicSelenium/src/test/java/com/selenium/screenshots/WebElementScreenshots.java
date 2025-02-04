package com.selenium.screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class WebElementScreenshots {
	@Test
	public void test() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu']/li[contains(.,'Comp')]"));
		driver.manage().window().maximize();
		
		File SearchButton = driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/searchButton.png");
		FileHandler.copy(SearchButton,dest);
		driver.close();
	}

}
