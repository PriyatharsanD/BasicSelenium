package com.selenium.screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotOnDriver {
	@Test
	public void screenshotTest() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ss = (TakesScreenshot)driver;
		File homePage = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/homePage.png");
		FileHandler.copy(homePage, dest);
		driver.close();
		
	}

}
