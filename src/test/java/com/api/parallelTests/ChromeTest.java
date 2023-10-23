package com.api.parallelTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void chromeTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Chrome opened!");
		driver.quit();
	}

}
