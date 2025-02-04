package com.selenium.Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenApplicationTest {
	@Test
	public void openFlipkartTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.close();
	}
	@Test
	public void openFlipkartInHeadless()
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.flipkart.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.close();
	}
	@Test
	public void openByFirefox()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.close();
	}
}