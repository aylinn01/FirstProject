package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		
		WebDriver  driver = new ChromeDriver();
Thread.sleep(5000);
driver.quit();

	}

}
