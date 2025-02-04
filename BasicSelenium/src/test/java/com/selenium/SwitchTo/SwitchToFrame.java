package com.selenium.SwitchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchToFrame {
	@Test
	public void iframeTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("Priya");
		driver.switchTo().defaultContent();
	}

}
