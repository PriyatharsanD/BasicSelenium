package com.selenium.screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class HighLightAndScreenshot {
	@Test
	public void highLightAndScreenshot() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchButton = driver.findElement(By.xpath("//input[contains(@class,'button-1') and contains(@value,'Search')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid green'",searchButton);
		
		File highLight = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/highLight.png");
		FileHandler.copy(highLight, dest);
		driver.close();
		
	}

}
