package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Homework 2:
//Using Css ONLY
//TC 2: Mercury Tours Registration: 
    //Open chrome browser
    //Go to “http://demo.guru99.com/test/newtours/”
    //Click on Register Link
    //Fill out all required info
    //Click Submit
    //User successfully registered

public class SeleniumLesson3HW2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
     
        driver.findElement(By.cssSelector("a[href(*='register']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Smith");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(     );
        driver.findElement(By.cssSelector("input[name='']")).sendKeys(   );
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(   );
        driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(  );
        
        
        
        
     
	

	}

}
