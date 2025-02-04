package com.selenium.Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HorizondalScroll {
	@Test
	public void scrollTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newHorizontal?scenario=1");
		driver.findElement(By.xpath("//a[contains(text(),'Op')]")).click();
		for(String window:driver.getWindowHandles())
		{
			driver.switchTo().window(window);
		}
		Actions action = new Actions(driver);
		action.scrollByAmount(800, 0).perform();
		driver.quit();
		
		
	}

}
