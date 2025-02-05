package com.selenium.Read;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadJson {
	@Test
	public void read() throws IOException, ParseException
	{
		FileReader reader = new FileReader("./src/test/resources/DataSource/CommonData/Credentials.json");
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject)parser.parse(reader);
		System.out.println(json.get("username"));
		System.out.println(json.get("password"));
		
	}
}
