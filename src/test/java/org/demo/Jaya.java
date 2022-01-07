package org.demo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jaya {
	static WebDriver driver;
	
	
	@BeforeClass
	public static void Beforeclass() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterClass
	public static void AfterClass() {
	
	driver.close();
}
	
	@Before
	public void before() {
	long start = System.currentTimeMillis();
	System.out.println(start);

}
@After
public void after() {
	long end = System.currentTimeMillis();
	System.out.println(end);

	

}

@Test
public void test() {
	WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Id *']"));
	username.sendKeys("greens");
	WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password *']"));
	pass.sendKeys("Hello");
	
	WebElement btn = driver.findElement(By.xpath("//input[@value='Login']"));
	btn.click();
	
	

}
}

