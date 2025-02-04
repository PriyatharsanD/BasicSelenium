package com.selenium.Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction {
	@Test
	public void mouseAction()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		WebElement circle = driver.findElement(By.id("circle"));
		Actions action = new Actions(driver);
		action.clickAndHold(circle).build().perform();
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		action.dragAndDrop(driver.findElement(By.xpath("//div[contains(text(),'Laptop Charger')]")), driver.findElement(By.xpath("//div[contains(@class,'drop')]/following-sibling::div"))).build().perform();

	}

}
