package org.demo;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class Junit extends baseclass{
	String path ="D:\\Pradeep\\ECLIPS\\eclipse\\demo\\excell data\\New Microsoft Excel Worksheet.xlsx";
	@BeforeClass
	public static void BeforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		
		
		
	}      
@AfterClass
	public static void AfterClass() {
	close();
		
	}

@Test
public void Test1() throws IOException {
	
	
	WebElement username = findElementById("username");
	String name = getData(path,"Sheet1" , 1, 0);
	type(username, name);
	WebElement password = findElementById("password");
	String passwordtxt = getData(path, "Sheet1", 1, 1);
	type(password, passwordtxt);
	WebElement login = findElementById("login");
	click(login);
	
	
	imple(30);
	
	WebElement texthotel = findElementByxpathtext("//td[@class='login_title']");
	String text = texthotel.getText();
	Assert.assertEquals("verifying search hotel", "Search Hotel (Fields marked with Red asterix (*) are mandatory)", text);
	
	
	
	
	WebElement sctlocation = findElementById("location");
	String locationdata = getData(path, "Sheet1", 1, 2);
	selectOptionsByText(sctlocation, locationdata);
	
	
	
	WebElement sctlhotels = findElementById("hotels");
	String scthotel = getData(path, "Sheet1", 1, 3);
	selectOptionsByText(sctlhotels, scthotel);
	
	WebElement roomtype = findElementById("room_type");
	String roomtypessclt = getData(path, "Sheet1", 1, 4);
	selectOptionsByText(roomtype, roomtypessclt);
	
	WebElement roomno = findElementById("room_nos");
	String roomnoslt = getData(path, "Sheet1", 1, 5);
	selectOptionsByText(roomno, roomnoslt);
	
	WebElement checkindate = findElementById("datepick_in");
	String checkindatedata = getData(path, "Sheet1", 1, 6);
	type(checkindate, checkindatedata);
	
	WebElement checkout = findElementById("datepick_out");
	String checkoutdate = getData(path, "Sheet1", 1, 7);
	type(checkout, checkoutdate);
	
	WebElement adult = findElementById("adult_room");
	String adultData = getData(path, "Sheet1", 1, 8);
	selectOptionsByText(adult, adultData);
	
	WebElement childroom = findElementById("child_room");
	String childroomdata = getData(path, "Sheet1", 1, 9);
	selectOptionsByText(childroom, childroomdata);
	
	WebElement submitclk = findElementById("Submit");
	click(submitclk);
	

	WebElement selecthotel = findElementByxpathtext("//td[@class='login_title']");
	String selecthoteltext = selecthotel.getText();
	Assert.assertEquals("verifying search hotel", "Select Hotel", selecthoteltext);
	
	WebElement radioclick= findElementById("radiobutton_0");
	click(radioclick);
	WebElement clkContinue= findElementById("continue");
	click(clkContinue);
	
	WebElement bookahotel = findElementByxpathtext("//td[text()='Book A Hotel ']");
	String bookhoteltext = bookahotel.getText();
	Assert.assertEquals("verifying search hotel", "Book A Hotel", bookhoteltext);
	
	
	WebElement TxtName = findElementById("first_name");
	String firstnamexl = getData(path, "Sheet1",1, 10);
	type(TxtName, firstnamexl);
	
	
	
	WebElement TxtlastName = findElementById("last_name");
	String firstlastnamexl = getData(path, "Sheet1",1, 11);
	type(TxtlastName, firstlastnamexl);
	
	WebElement txtAdress = findElementById("address");
	String adress = getData(path, "Sheet1",1, 12);
	type(txtAdress, adress);
	
	WebElement ccnum = findElementById("cc_num");
	String ccnumdata = getData(path, "Sheet1",1, 13);
	type(ccnum, ccnumdata);
	
	
	
	WebElement cctype = findElementById("cc_type");
	selectOptionsByText(cctype, "VISA");
	
	WebElement mnth = findElementById("cc_exp_month");
	selectOptionsByText(mnth, "May");
	
	WebElement year = findElementById("cc_exp_year");
	selectOptionsByText(year, "2020");
	
	WebElement cvv = findElementById("cc_cvv");
	String cvvdata = getData(path, "Sheet1",1, 16);
	type(cvv, cvvdata);
	
	
	WebElement booknow = findElementById("book_now");
	click(booknow);
	
	
	
	WebElement cnfrmbooking = findElementByxpathtext("//td[text()='Booking Confirmation ']");
	String cnfrmbookingtext = cnfrmbooking.getText();
	Assert.assertEquals("verifying search hotel", "Booking Confirmation", cnfrmbookingtext);
	
	
	WebElement clickBookedItinerary =  findElementByxpathtext("//a[text()='Booked Itinerary']");
	clickBookedItinerary.click();
	

WebElement clickcancel =  findElementByxpathtext("//input[contains(@id,'btn_id_')]");
clickcancel.click();
 alertAccept();

	
	WebElement error =  findElementById("search_result_error");
	String text1 = error.getText();
	System.out.println(text1);
	
	Assert.assertEquals("verify", "The booking has been cancelled.",text1 );
	
	
	
	

	

	
	

	
	
	
	
	
	


	
	
	
	
	
	
	
	
}



}
