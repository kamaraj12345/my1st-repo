package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel extends baseclass { 
	public searchHotel() {
		PageFactory.initElements(driver, this);
	}
	   
	 
	
	@FindBy(id="radiobutton_0")
	private WebElement radioclick;
	
	@FindBy(id="continue")
	private WebElement clkContinue;

	public WebElement getRadioclick() {
		return radioclick;
	}

	public WebElement getClkContinue() {
		return clkContinue;
	}
	
	public void searchHhotel() {
		click(getRadioclick());
		click(getClkContinue());
		
		
	
	}
	
}
