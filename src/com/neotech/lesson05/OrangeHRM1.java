package com.neotech.lesson05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRM1 {
	//open Chrome browser
	//navigate to https://hrm.neotechacademy.com/
	//print the title of page
	// close the browser

	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"/configs/configuration.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop);
		
		WebDriver driver = null;
		
		if (prop.getProperty("browser").equals("chrome")) {
		
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
		driver= new FirefoxDriver();
		
			String website =prop.getProperty("url");
		driver.get(website);
		String title = driver.getTitle();
		System.out.println("title:"+title);
		
		
		
		}
	}

}
