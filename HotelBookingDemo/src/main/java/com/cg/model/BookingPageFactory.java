package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPageFactory {

	WebDriver driver;

	@FindBy(name="txtFN")
	@CacheLookup
	WebElement firstName;

	@FindBy(name="txtLN")
	@CacheLookup
	WebElement lastName;

	@FindBy(name="Email")
	@CacheLookup
	WebElement email;

	@FindBy(name="Phone")
	@CacheLookup
	WebElement phone;

	@FindBy(className="btn")
	@CacheLookup
	WebElement loginBtn;

	//Locates elements matching a XPath selector.
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[6]/td[2]/input[1]")
	@CacheLookup
	WebElement gen1;

	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[6]/td[2]/input[2]")
	@CacheLookup
	WebElement gen2;

	@FindBy(name="city")
	@CacheLookup
	WebElement city;

	@FindBy(name="state")
	@CacheLookup
	WebElement state;

	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[12]/td[2]/input[1]")
	@CacheLookup
	WebElement ac;

	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[12]/td[2]/input[2]")
	@CacheLookup
	WebElement nonac;

	//Locates an element by its ID
	@FindBy(id ="txtCardholderName")
	@CacheLookup
	WebElement cardHolder;

	//Locates an element by its name
	@FindBy(name="debit")
	@CacheLookup
	WebElement debitNo;

	@FindBy(name="cvv")
	@CacheLookup
	WebElement cvv;

	@FindBy(name="month")
	@CacheLookup
	WebElement month;

	@FindBy(name="year")
	@CacheLookup
	WebElement year;

	public BookingPageFactory()
	{	
	}

	public BookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}

	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	public void setPhone(String pno) {
		phone.sendKeys(pno);
	}

	public void setGender(String gen) {
		if(gen.equalsIgnoreCase("female"))
			gen2.click();
		else
			gen1.click();
	}

	public void setCity(String city1) {
		city.sendKeys(city1);
	}

	public void setState(String state1) {
		state.sendKeys(state1);
	}

	public void setRoom(String room) {
		if(room.equalsIgnoreCase("AC"))
			ac.click();
		if(room.equalsIgnoreCase("NON AC"))
			nonac.click();
	}
	
	public void setCardHolder(String CHolder) {
		cardHolder.sendKeys(CHolder);
	}

	public void setDerbitNum(String dno) {
		debitNo.sendKeys(dno);
	}

	public void setCvv(String cvv1) {
		cvv.sendKeys(cvv1);
	}

	public void setExpMon(String expMon) {
		month.sendKeys(expMon);
	}
	public void setExpYear(String expYear) {
		year.sendKeys(expYear);
	}

	public void clickLoginButton() {
		loginBtn.click();
	}
}

