package com.selenium.jsExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadTitleAndText {
	@Test
	public void getTittleTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title=(String)js.executeScript("return document.title;");
		System.out.println(title);
		
		String text = (String)js.executeScript("return document.documentElement.innerText");
		System.out.println(text);
	}

}
