package com.selenium.dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropdown {
	@Test
	public void handleDropDown()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement element = driver.findElement(By.xpath("//ul[@class='top-menu']/li[contains(.,'Comp')]"));
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Digital")).click();
		WebElement sort = driver.findElement(By.xpath("//select[1]/..//following-sibling::div/select[@name='products-orderby']"));
		Select select = new Select(sort);
		select.selectByIndex(1);
		driver.close();
	}
}