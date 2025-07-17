package org.Generic_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

		
		public static String readdatafromproperties(String key)
		{
			 File file = new File("./TestData/config.properties");
	    		FileInputStream fis=null;
				try {
					fis = new FileInputStream(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		Properties prop = new Properties();
	    		try {
					prop.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		return prop.getProperty(key);

			
			
		}
		public static String readdatafromexcel(String sheetname,int rowIndex,int cellIndex)
		{
			File f = new File("./TestData/reg.xlsx");
			FileInputStream fis=null;
			try {
				fis = new FileInputStream(f);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			Workbook workbook=null;
			try {
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			String data=workbook.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).toString();
			return data;
		}
	}


