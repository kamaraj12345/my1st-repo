package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ram {
	
	WebDriver driver;
	private void lanchingBrowser() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

	}
	private void setUrl(String Url) {
	
driver.get(Url);
driver.manage().window().maximize();
	}
	
	private WebElement findelementbyid(String artibutevale) {
		WebElement element = driver.findElement(By.id(artibutevale));
		return element;


	}
	private WebElement findelementbyname(String Arrtibutevale) {
		WebElement element = driver.findElement(By.name(Arrtibutevale));
		return element;
	}
	

}
