package com.neotech.lesson01;

public interface I_WebDriver {
	public void get(String url);
	public String getTitle();
	public String getCurrentUrl();
	public void close();
	public void quit();

	public static void main(String[] args) {
		
		

	}

}
