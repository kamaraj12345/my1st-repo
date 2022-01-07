package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmaion extends baseclass{
	public BookingConfirmaion() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="order_no")
	private WebElement order;
	
	
	public WebElement getOrder() {
		return order;
	}
	
	
	public void order() {
		
		System.out.println(getAttributeValue(order));
		

	}
	
	
	
	
	

}
