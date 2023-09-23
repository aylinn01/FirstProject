package com.neotech.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		//Creating a driver object referencing WebDriver interface
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

       //Setting the webdriver.chrome.driver property to its executable's location
      // System.setProperty("webdriver.chrome.driver", "/lib/chromeDriver/chromedriver.exe");
   
       //Instantiating driver object
       WebDriver driver = new ChromeDriver();
       
       //Using get() method to open a webpage
       driver.get("https://neotechacademy.com");
       Thread.sleep(5000);	
       //Closing the browser
       driver.quit();
	}
}