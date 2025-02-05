package com.selenium.Read;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile {
	@Test
	public void Read() throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/DataSource/CommonData/CommonData.properties");
		Properties properties = new Properties();
		properties.load(fis);
		System.out.println(properties.get("URL"));
		System.out.println(properties.get("Browser"));
	}

}
