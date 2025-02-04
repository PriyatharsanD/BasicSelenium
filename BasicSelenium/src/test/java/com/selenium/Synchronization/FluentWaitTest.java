package com.selenium.Synchronization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FluentWaitTest {
	@Test
	public void flientTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		//WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		
		Collection coll = new ArrayList<Exception>();
		coll.add(NullPointerException.class);
		coll.add(NoSuchElementException.class);
		
		FluentWait wait2 = new FluentWait(driver);
		wait2.pollingEvery(Duration.ofSeconds(1));
		wait2.withTimeout(Duration.ofSeconds(10));
		wait2.ignoring(NoSuchElementException.class);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("twotabsgearchtextbox"))));
		
		//wait2.ignoreAll(coll);
		
		//searchField.submit();
		
		driver.close();
	}
}
