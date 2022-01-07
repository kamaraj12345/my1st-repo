package org.demo;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg extends baseclass{
	
	String path ="D:\\Pradeep\\ECLIPS\\eclipse\\demo\\excell data\\New Microsoft Excel Worksheet.xlsx";

	@BeforeClass
	private void beforClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		imple(30);
		

	}
	@AfterClass
	private void AftreClass() {
		close();
		

	}
	@Test
	
	private void test() throws IOException {
		LoginPage cp = new LoginPage();
	cp.singup(getData(path,"Sheet1" , 1, 0), getData(path, "Sheet1", 1, 1));
		
		SelectHotel sclthotel =new SelectHotel();
		sclthotel.searchhotels("Brisbane", "Hotel Sunshine", "Super Deluxe", "3 - Three", "04/01/2022", "05/01/2022", "3 - Three", "1 - One");
		
		searchHotel clkhotel = new searchHotel();
		clkhotel.searchHhotel();
		
		BookAHotel bookhotel = new BookAHotel();
		bookhotel.bookhotel(getData(path, "Sheet1",1, 10), getData(path, "Sheet1",1, 11), getData(path, "Sheet1",1, 12), getData(path, "Sheet1",1, 13), "VISA", "May", "2020", getData(path, "Sheet1",1, 16));
		
		BookingConfirmaion Bc = new BookingConfirmaion();
		Bc.order();
		CancelMsg cm = new CancelMsg();
		cm.errormsg();
		
		
		

	}
	
}
