package org.test;

import org.demo.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
	
	
	@Parameters({"browser"})
	@Test
	
private void test1(String browserName) {
		
		
		if (browserName.equals("chrome")) {
			
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		
}  
		else if (browserName.equals("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	
	
}
		else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.co.in/");
			
			
		}
		else {
			System.out.println("none of the browser");
		}
		
	
	
	
	}
	
	
	
	
}
