package com.selenium.proprties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class demoPropertiesFile {
	static Properties prop;
	String Filepath = ".//config.properties";

	public demoPropertiesFile() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(Filepath);
		prop.load(fis);
//		prop.load(new FileInputStream(Filepath));
	}

}
