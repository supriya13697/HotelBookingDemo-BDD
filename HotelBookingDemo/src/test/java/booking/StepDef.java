package booking;

import static org.testng.Assert.assertEquals;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.cg.model.BookingPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	BookingPageFactory bookingPage;
	WebDriver driver;

	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
		
		//create a new instance of firefox driver
		driver = new FirefoxDriver();
		
		//used to navigate to hotelbooking
		driver.get("D:\\HotelBookingDemo\\hotelbooking.html");
		
		//creating object of LoginPageFactory
		bookingPage = new BookingPageFactory(driver);
		
		System.out.println("Page loaded in browser");
	}

	@When("^Firstname is blank$")
	public void firstname_is_blank() throws Throwable {
		bookingPage.setFirstName("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display Error Message 'Please enter Firstname'$")
	public void display_Error_Message_Please_enter_Firstname() throws Throwable {
		
		//To get the text of the alert
		String actualErrorMsg = driver.switchTo().alert().getText();
		
		String expErrorMsg = "Please fill the First Name";
		assertEquals(expErrorMsg, actualErrorMsg);
		
		//To accept the alert(switch from main window to an alert)
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Firstname is given but lastname is blank$")
	public void firstname_is_given_but_lastname_is_blank() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display Error Message 'Please enter Lastname'$")
	public void display_Error_Message_Please_enter_Lastname() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the Last Name";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Email is blank$")
	public void email_is_blank() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter email'$")
	public void display_alert_Please_enter_email() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the Email";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Mobile Number is blank$")
	public void mobile_Number_is_blank() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter mobile number'$")
	public void display_alert_Please_enter_mobile_number() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the Mobile No.";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Invalid email is entered$")
	public void invalid_email_is_entered() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("shajgd");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Invalid email'$")
	public void display_alert_Invalid_email() throws Throwable {
		String expErrMsg = "Please enter valid Email Id.";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Invalid Mobile Number is entered$")
	public void invalid_Mobile_Number_is_entered() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("2123546556");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Invalid Mobile Number'$")
	public void display_alert_Invalid_Mobile_Number() throws Throwable {
		String expErrMsg = "Please enter valid Contact no.";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Gender is not selected$")
	public void gender_is_not_selected() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please select gender'$")
	public void display_alert_Please_select_gender() throws Throwable {
		String expErrMsg = "Please Select the Gender";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^City is not choosen$")
	public void city_is_not_choosen() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please select city'$")
	public void display_alert_Please_select_city() throws Throwable {
		String expErrMsg = "Please select city";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^State is not chosen$")
	public void state_is_not_chosen() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.setCity("Pune");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please select state'$")
	public void display_alert_Please_select_state() throws Throwable {
		String expErrMsg = "Please select state";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Type of room is not selected$")
	public void type_of_room_is_not_selected() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Telangana");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please select type of room'$")
	public void display_alert_Please_select_type_of_room() throws Throwable {
		String expErrMsg = "Please select the Room type";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}


	@When("^Card Holder name is not entered$")
	public void card_Holder_name_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Telangana");
		bookingPage.setRoom("AC");
		bookingPage.setCardHolder("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter Card Holder name'$")
	public void display_alert_Please_enter_Card_Holder_name() throws Throwable {
		String expErrMsg = "Please fill the Card holder name";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Debit card number is not entered$")
	public void debit_card_number_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Telangana");
		bookingPage.setRoom("AC");
		bookingPage.setCardHolder("SupriyaReddy");
		bookingPage.setDerbitNum("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter Debit card number'$")
	public void display_alert_Please_enter_Debit_card_number() throws Throwable {
		String expErrMsg = "Please fill the Debit card Number";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^CVV is not entered$")
	public void cvv_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Telangana");
		bookingPage.setRoom("AC");
		bookingPage.setCardHolder("SupriyaReddy");
		bookingPage.setDerbitNum("961256781234");
		bookingPage.setCvv("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter CVV'$")
	public void display_alert_Please_enter_CVV() throws Throwable {
		String expErrMsg = "Please fill the CVV";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Expiration month is not entered$")
	public void expiration_month_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Telangana");
		bookingPage.setRoom("AC");
		bookingPage.setCardHolder("SupriyaReddy");
		bookingPage.setDerbitNum("961256781234");
		bookingPage.setCvv("321");
		bookingPage.setExpMon("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter Expiration month'$")
	public void display_alert_Please_enter_Expiration_month() throws Throwable {
		String expErrMsg = "Please fill expiration month";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Expiration year is not entered$")
	public void expiration_year_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Telangana");
		bookingPage.setRoom("AC");
		bookingPage.setCardHolder("SupriyaReddy");
		bookingPage.setDerbitNum("961256781234");
		bookingPage.setCvv("321");
		bookingPage.setExpMon("11");
		bookingPage.setExpYear("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter Expiration year'$")
	public void display_alert_Please_enter_Expiration_year() throws Throwable {
		String expErrMsg = "Please fill the expiration year";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^All details are valid$")
	public void all_details_are_valid() throws Throwable {
		bookingPage.setFirstName("Supriya");
		bookingPage.setLastName("Supriya");
		bookingPage.setEmail("supriya.kovvuri@capgemini.com");
		bookingPage.setPhone("7702725233");
		bookingPage.setGender("female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Telangana");
		bookingPage.setRoom("AC");
		bookingPage.setRoom("NON AC");
		bookingPage.setCardHolder("SupriyaReddy");
		bookingPage.setDerbitNum("961256781234");
		bookingPage.setCvv("321");
		bookingPage.setExpMon("11");
		bookingPage.setExpYear("2020");
		bookingPage.clickLoginButton();
	}

	@Then("^go to sucess form$")
	public void go_to_sucess_form() throws Throwable {
		driver.navigate().to("D:\\HotelBookingDemo\\success.html");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
