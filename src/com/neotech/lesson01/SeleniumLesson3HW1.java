package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLesson3HW1 {
	//Homework 1: Using xPath ONLY
    //TC 2: Mercury Tours Registration: Open chrome browser
    // Go to “http://demo.guru99.com/test/newtours/”  Click on Register Link
     // Fill out all required info Click Submit. User successfully registered
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		        WebDriver driver = new ChromeDriver();
		        String url = "http://demo.guru99.com/test/newtours/";
		        driver.get(url);
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//a[@href='register.php']")).click();
		     
		        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("John");
		        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Smith");
		        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123-45-45");
		        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Johnsimith@gmail.com");
		        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Manhattan");
		        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("NewYork City");
		        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("22");
		        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("New York");
		        driver.findElement(By.xpath("//select[@name='country']")).sendKeys("United States");
		        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("John");
		        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("J@2023");
		        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("J@2023");
		        driver.findElement(By.xpath("//input[@name='submit']")).click();
		        Thread.sleep(2000);
		        driver.quit();
		        
		        

	}

}
