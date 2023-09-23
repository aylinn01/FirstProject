package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson4Task1 {

		// Open chrome browser
		//Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
		//Enter valid username and password
		//Click on login button
		//Then verify "Web Orders" is displayed and also username is displayed right top corner
		public static String url = "https://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/lpgin.aspx";
		
		public static void main(String[] args){

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver = new ChromeDriver();

			driver.get(url);
			
			
			
			
	}

}
