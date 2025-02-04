package com.selenium.Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("iphone");
		searchField.submit();
		
		List<WebElement> price=driver.findElements(By.xpath("//span[contains(@class,'a-price-whole')]"));
		System.out.println(price);
		for(WebElement web : price)
		{
			System.out.println(web.getText());
		}
		driver.close();
	}

}
