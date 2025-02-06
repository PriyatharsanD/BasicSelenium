package com.selenium.SwitchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SwitchTabs {
	@Test
	public void  testTabs()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		
		String parent=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.makemytrip.com/");
		
		String child=driver.getWindowHandle();
		driver.switchTo().window(parent);
		WebElement search = driver.findElement(By.xpath("//span[contains(@class,'bwc') and @id='4']"));

		Actions actions = new Actions(driver);
		actions.click(search).perform();
		actions.sendKeys("Interstellar").perform();
		actions.keyDown(Keys.ENTER);
		
		driver.switchTo().window(child);
		WebElement mobile =driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Mobile') and contains(@class,'font14 fullWidth')]"));
		mobile.sendKeys("7397318502");
		driver.findElement(By.xpath("//button[contains(.,'Con')]")).click();
	}

}
