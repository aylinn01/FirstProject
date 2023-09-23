package com.neotech.lesson05;

import com.neotech.utils.BaseClass;

public class OrangeHRM3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
	setUp();
	
	String title = driver.getTitle();
	System.out.println("title:"+title);
	Thread.sleep(3000);
	
	
	tearDown();

	}

}
