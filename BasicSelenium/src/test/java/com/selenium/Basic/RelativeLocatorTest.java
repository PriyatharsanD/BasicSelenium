package com.selenium.Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeLocatorTest {
	@Test
	public void above()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement computer = driver.findElement(By.xpath("//div[@class='leftside-3']/descendant::li[contains(.,'Comp')]"));
		WebElement register = driver.findElement(RelativeLocator.with(By.partialLinkText("Book")).above(computer));
		register.click();
		driver.close();
	}
	@Test
	public void below()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement computer = driver.findElement(By.xpath("//div[@class='leftside-3']/descendant::li[contains(.,'Comp')]"));
		WebElement register = driver.findElement(RelativeLocator.with(By.partialLinkText("Electro")).below(	computer));
		register.click();
		driver.close();
	}
	@Test
	public void toLeftOf()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement computer = driver.findElement(By.xpath("(//div[@class='header-menu']/descendant::a[contains(text(),'Com')])[1]"));
		WebElement book = driver.findElement(RelativeLocator.with(By.xpath("//a[contains(.,'Boo')]")).toLeftOf(computer));
		Actions actions = new Actions(driver);
		actions.moveToElement(book).click().perform();
		driver.close();
	}
	@Test
	public void toRightOf()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement computer = driver.findElement(By.xpath("(//div[@class='header-menu']/descendant::a[contains(text(),'Com')])[1]"));
		WebElement electronics = driver.findElement(RelativeLocator.with(By.xpath("//a[contains(.,'Ele')]")).toRightOf(computer));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).click().perform();
		driver.close();
	}
	@Test
	public void near()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		WebElement computer = driver.findElement(By.xpath("(//div[@class='header-menu']/descendant::a[contains(text(),'Com')])[1]"));
		WebElement electronics = driver.findElement(RelativeLocator.with(By.xpath("//a[contains(.,'Ele')]")).near(computer));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).click().perform();
		driver.close();
	}
}