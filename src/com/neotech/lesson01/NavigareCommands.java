package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigareCommands {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		String url = "https:instagram.com/";
		
		driver.navigate().to(url);
		//will keep history
		//will not for the page and elements to be loaded
		
		driver.manage().window().fullscreen(); //will make full screen
		driver.manage().window().minimize();
		
		Thread.sleep(1000);
		driver.quit();
		

	}

}
