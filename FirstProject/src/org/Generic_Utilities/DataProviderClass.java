package org.Generic_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "register data provider")
    public String[][] registerDataProvider() {

        File f = new File("./TestData/reg.xlsx");

        FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

        Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

        Sheet sheet = wb.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();
        int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

        String[][] arr = new String[rowCount - 1][cellCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < cellCount; j++) {
                arr[i - 1][j] = sheet.getRow(i).getCell(j).toString();
            }
        }
		return arr;

        

        // Close the workbook and file input stream
        
    }
}
