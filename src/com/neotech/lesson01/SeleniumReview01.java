package com.neotech.lesson01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumReview01 {
	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
WebDriver driver = new FirefoxDriver();

String url ="https://www.nytimes.com/games/wordle/";
driver.get(url);

Thread.sleep(1000);

String currentURL =driver.getCurrentUrl();
if (url.equals(currentURL)) {
	System.out.println("Urls are the same");
}else {
System.out.println("Urls are different");

}
System.out.println(url);


	}

}
