package org.demo;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class function {

	public static void main(String[] args) throws IOException {
		baseclass b = new  baseclass();
		b.getDriver();
		
		b.loadUrl("https://adactinhotelapp.com/");
		b.imple(30);
		
		String path ="D:\\Pradeep\\ECLIPS\\eclipse\\demo\\excell data\\New Microsoft Excel Worksheet.xlsx";
		
		WebElement username = b.findElementById("username");
		String name = b.getData(path,"Sheet1" , 1, 0);
		b.type(username, name);
		WebElement password = b.findElementById("password");
		String passwordtxt = b.getData(path, "Sheet1", 1, 1);
		b.type(password, passwordtxt);
		WebElement login = b.findElementById("login");
		b.click(login);
		
		
		
		
		WebElement sctlocation = b.findElementById("location");
		String locationdata = b.getData(path, "Sheet1", 1, 2);
		b.selectOptionsByText(sctlocation, locationdata);
		
		WebElement sctlhotels = b.findElementById("hotels");
		String scthotel = b.getData(path, "Sheet1", 1, 3);
		b.selectOptionsByText(sctlhotels, scthotel);
		
		WebElement roomtype = b.findElementById("room_type");
		String roomtypessclt = b.getData(path, "Sheet1", 1, 4);
		b.selectOptionsByText(roomtype, roomtypessclt);
		
		WebElement roomno = b.findElementById("room_nos");
		String roomnoslt = b.getData(path, "Sheet1", 1, 5);
		b.selectOptionsByText(roomno, roomnoslt);
		
		WebElement checkindate = b.findElementById("datepick_in");
		String checkindatedata = b.getData(path, "Sheet1", 1, 6);
		b.type(checkindate, checkindatedata);
		
		WebElement checkout = b.findElementById("datepick_out");
		String checkoutdate = b.getData(path, "Sheet1", 1, 7);
		b.type(checkout, checkoutdate);
		
		WebElement adult = b.findElementById("adult_room");
		String adultData = b.getData(path, "Sheet1", 1, 8);
		b.selectOptionsByText(adult, adultData);
		
		WebElement childroom = b.findElementById("child_room");
		String childroomdata = b.getData(path, "Sheet1", 1, 9);
		b.selectOptionsByText(childroom, childroomdata);
		
		WebElement submitclk = b.findElementById("Submit");
		b.click(submitclk);
		
		
		WebElement radioclick= b.findElementById("radiobutton_0");
		b.click(radioclick);
		WebElement clkContinue= b.findElementById("continue");
		b.click(clkContinue);
		
		
		
		WebElement TxtName = b.findElementById("first_name");
		String firstnamexl = b.getData(path, "Sheet1",1, 10);
		b.type(TxtName, firstnamexl);
		
		WebElement TxtlastName = b.findElementById("last_name");
		String firstlastnamexl = b.getData(path, "Sheet1",1, 11);
		b.type(TxtlastName, firstlastnamexl);
		
		WebElement txtAdress = b.findElementById("address");
		String adress = b.getData(path, "Sheet1",1, 12);
		b.type(txtAdress, adress);
		
		WebElement ccnum = b.findElementById("cc_num");
		String ccnumdata = b.getData(path, "Sheet1",1, 13);
		b.type(ccnum, ccnumdata);
		
		
		
		WebElement cctype = b.findElementById("cc_type");
		b.selectOptionsByText(cctype, "VISA");
		
		WebElement mnth = b.findElementById("cc_exp_month");
		b.selectOptionsByText(mnth, "May");
		
		WebElement year = b.findElementById("cc_exp_year");
		b.selectOptionsByText(year, "2020");
		
		WebElement cvv = b.findElementById("cc_cvv");
		String cvvdata = b.getData(path, "Sheet1",1, 16);
		b.type(cvv, cvvdata);
		
		
		WebElement booknow = b.findElementById("book_now");
		b.click(booknow);
		
		
		WebElement order = b.findElementById("order_no");
		String out = b.getAttributeValue(order);
		b.UpdateValueinExcel(path, "Sheet1", 1, 18, out);
		System.out.println(out);
		
		
		WebElement clickBookedItinerary = b.findElementByxpathtext("//a[text()='Booked Itinerary']");
		clickBookedItinerary.click();
		
	
	WebElement clickcancel = b.findElementByxpathtext("//input[contains(@id,'btn_id_')]");
	clickcancel.click();
	b.alertAccept();
	
	
		
		WebElement error = b.findElementById("search_result_error");
		String text = error.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
