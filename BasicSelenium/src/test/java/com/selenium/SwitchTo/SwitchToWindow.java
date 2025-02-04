package com.selenium.SwitchTo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchToWindow {
	@Test
	public void windowHandle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Facebook")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows)
		{
			driver.switchTo().window(window);
		}
		driver.close();
	}
}