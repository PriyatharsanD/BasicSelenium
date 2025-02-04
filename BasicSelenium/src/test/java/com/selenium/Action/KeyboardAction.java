package com.selenium.Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAction {
	@Test
	public void keyboardActionTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/keyboard");
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.name("handleInput"))).perform();
		action.sendKeys("L").perform();
		action.keyDown(Keys.SHIFT).perform();
		action.sendKeys("a").perform();
		action.keyUp(Keys.SHIFT).perform();
	}

}
