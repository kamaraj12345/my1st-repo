package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends baseclass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement sctlocation;
	
	
	@FindBy(id="hotels")
	private WebElement sctlhotels;
	
	
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submitclk;

	public WebElement getSctlocation() {
		return sctlocation;
	}

	public WebElement getSctlhotels() {
		return sctlhotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmitclk() {
		return submitclk;
	}

	public void searchhotels(String location,  String hotels,String roomtype,String numberofrooms,String checkindate, String checkoutdate, String aduitsPerRoom, String childrenPreRoom ) {
	
		selectOptionsByText(getSctlocation(), location);
		selectOptionsByText(getSctlhotels(), hotels);
		selectOptionsByText(getRoomtype(), roomtype);
		selectOptionsByText(getRoomno(), numberofrooms);
		
		type(getCheckindate(), checkindate);
		type(getCheckout(), checkoutdate);
		
		selectOptionsByText(getAdult(), aduitsPerRoom);
		
		selectOptionsByText(getChildroom(), childrenPreRoom);
		
		click(getSubmitclk());
		
		
	}
}

	
	
	
	

