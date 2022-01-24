package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {

		File src = new File("./Configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getApplicationURL() {

		String url = prop.getProperty("baseURL");
		return url;

	}

	public String getUsername() {

		String un = prop.getProperty("username");
		return un;
	}

	public String getPassword() {

		String pw = prop.getProperty("password");
		return pw;
	}

	public String getChromePath() {

		String chrome = prop.getProperty("chromepath");
		return chrome;
	}

	public String getFirefoxPath() {

		String chrome = prop.getProperty("Firefoxpath");
		return chrome;
	}
	
	
}
