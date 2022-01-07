package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelMsg extends baseclass{
	public CancelMsg() {
		PageFactory.initElements(driver, this);
	}
		
		
	
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement clickBookedItinerary;
	
	@FindBy(xpath="//input[contains(@id,'btn_id_')]")
	private WebElement clickcancel;
	
	@FindBy(id="search_result_error")
	private WebElement error;


	public WebElement getClickBookedItinerary() {
		return clickBookedItinerary;
	}


	public WebElement getClickcancel() {
		return clickcancel;
	}


	public WebElement getError() {
		return error;
	}

	
	public void errormsg() {
		click(getClickBookedItinerary());
		click(getClickcancel());
		alertAccept();
		getText(getError());
		System.out.println( getText(getError()));
 
	}
	
	
}
