package org.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchinDataFromProperties {

	public static void main(String[] args) throws IOException {
		//step 1 :crete fileinputstrem object
		File file = new File("./TestData/config.properties");
		FileInputStream fis = new FileInputStream(file);
		//step 2 create object for proprties class 
		Properties prop = new Properties();
		//use load method with referance method 
		prop.load(fis);
		System.out.println(prop.getProperty("Url"));
	}
}
