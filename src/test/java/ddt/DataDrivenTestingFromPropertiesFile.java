package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenTestingFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//1:-this is done convert physical file into java Representation;
		FileInputStream fis=new FileInputStream("D:\\Eclipse Programs\\AutomationFinal\\testData\\khelavan.properties");
		//2:-this is done to read key and value pair from Properties file;
		Properties prop=new Properties();
		prop.load(fis);
		//call getProperty() by taking the reference of Properties class and pass the key for
		//which you want to get value return type is String;
		String kname=prop.getProperty("name");
		System.out.println(kname);
	}

}
