package com.selenium.Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementMethods {
	@Test
	public void methodsTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement search = driver.findElement(By.id("small-searchterms"));
		System.out.println(search.getText());
		System.out.println(search.getCssValue("font-family"));
		System.out.println(search.getAttribute("name"));
		System.out.println(search.getTagName());
		System.out.println(search.isEnabled());
		System.out.println(search.isDisplayed());
		System.out.println(search.isSelected());
		System.out.println(search.getSize());
		System.out.println(search.getLocation());
		Rectangle rect = search.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		search.sendKeys("Laptop");
		search.clear();
		search.sendKeys("Mobiles");
		search.submit();
		driver.manage().window().maximize();
		driver.close();
	}

}
