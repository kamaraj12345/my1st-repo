package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends baseclass {
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
		
		
		
		@FindBy(id="first_name")
		private WebElement TxtName;
	
		@FindBy(id="last_name")
		private WebElement TxtlastName;
		
		@FindBy(id="address")
		private WebElement txtAdress;
		
		@FindBy(id="cc_num")
		private WebElement ccnum;
		
		@FindBy(id="cc_type")
		private WebElement cctype;
		
		@FindBy(id="cc_exp_month")
		private WebElement mnth;
		
		@FindBy(id="cc_exp_year")
		private WebElement year;
		
		@FindBy(id="cc_cvv")
		private WebElement cvv;
		
		@FindBy(id="book_now")
		private WebElement booknow;

		public WebElement getTxtName() {
			return TxtName;
		}

		public WebElement getTxtlastName() {
			return TxtlastName;
		}

		public WebElement getTxtAdress() {
			return txtAdress;
		}

		public WebElement getCcnum() {
			return ccnum;
		}

		public WebElement getCctype() {
			return cctype;
		}

		public WebElement getMnth() {
			return mnth;
		}

		public WebElement getYear() {
			return year;
		}

		public WebElement getCvv() {
			return cvv;
		}

		public WebElement getBooknow() {
			return booknow;
		}
		
		
		public void bookhotel(String FirstName, String LastName, String Adress, String ccnum,String cctype, String mnth, String year, String Cvv) {
			
			type(getTxtName(), FirstName);
			type(getTxtlastName(), LastName);
			type(getTxtAdress(), Adress);
			type(getCcnum(), ccnum);
			selectOptionsByText(getCctype(), cctype);
			selectOptionsByText(getMnth(), mnth);
			selectOptionsByText(getYear(), year);
			type(getCvv(), Cvv);
			click(getBooknow());
			
			
			
			
			

		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	


