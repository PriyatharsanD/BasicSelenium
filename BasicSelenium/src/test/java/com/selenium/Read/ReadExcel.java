package com.selenium.Read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readExcelTest() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/DataSource/TestData/sample.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet= wb.getSheet("employee");
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).toString()+" ");
			}
			System.out.println();
		}
		
	}

}
