package com.neotech.lesson01;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.neotechacademy.com/");
		
		 String actualURL = driver.getCurrentUrl();
		 String expectedURL = "https://www.neotechacademy.com/";
		
		if(actualURL.equalsIgnoreCase(expectedURL))
		{
			System.out.println("Title: " + driver.getTitle());
		}
		else
		{
			System.out.println("The url is wrong!!");
		}
		
		Thread.sleep(5000);
		
		driver.quit();
	}

	

	}


