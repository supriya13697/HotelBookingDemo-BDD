package login;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cg.model.LoginPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefN {

	LoginPageFactory loginPage;
	WebDriver driver;

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable 
	{
		driver = new FirefoxDriver();
		driver.get("D:\\HotelBookingDemo\\login.html");
		//creating object of LoginPageFactory
		loginPage = new LoginPageFactory(driver);
		System.out.println("Page loaded in browser");
	}

	@When("^Username password is blank$")
	public void username_password_is_blank() throws Throwable
	{
		
		//accessing and setting some value
//		WebElement userNameTxt = driver.findElement(By.name("userName"));
//		userNameTxt.sendKeys("");
//		
//		WebElement loginBtn = driver.findElement(By.className("btn"));
//		loginBtn.click();
		loginPage.setUserName("");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
	}

	@Then("^Display Error Message 'Please enter userName'$")
	public void display_Error_Message_Please_enter_Username() throws Throwable 
	{
		
//		WebElement divEle = driver.findElement(By.id("userErrMsg"));
//		String actualErrorMsg = divEle.getText();
		String actualErrorMsg = loginPage.getUserNameError();
		String expErrorMsg = "* Please enter userName.";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.close();
	}

	@When("^Username ig given but password is blank$")
	public void username_ig_given_but_password_is_blank() throws Throwable {
		
//		WebElement userTxt = driver.findElement(By.name("userName"));
//		WebElement pwdTxt = driver.findElement(By.name("userPwd"));
//		WebElement loginBtn = driver.findElement(By.className("btn"));
//		userTxt.sendKeys("Supriya");
//		pwdTxt.sendKeys("");
//		loginBtn.click();
		loginPage.setUserName("Supriya");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
	}

	@Then("^Display Error Message 'Please enter password'$")
	public void display_Error_Message_Please_enter_Password() throws Throwable {
		
//		WebElement divEle = driver.findElement(By.id("pwdErrMsg"));
//		String actualErrorMsg = divEle.getText();
		String actualErrorMsg = loginPage.getPasswordError();
		String expErrorMsg = "* Please enter password.";
		assertEquals(expErrorMsg, actualErrorMsg);
	}

	@When("^Invalid username password is entered$")
	public void invalid_username_password_is_entered() throws Throwable {
		
//		WebElement userTxt = driver.findElement(By.name("userName"));
//		WebElement pwdTxt = driver.findElement(By.name("userPwd"));
//		WebElement loginBtn = driver.findElement(By.className("btn"));
//		userTxt.sendKeys("supriya");
//		pwdTxt.sendKeys("supriya");
//		loginBtn.click();
		loginPage.setUserName("supriya");
		loginPage.setPassword("supriya");
		loginPage.clickLoginButton();
	}

	@Then("^Display alert 'Invalid login'$")
	public void display_alert_Invalid_login() throws Throwable {
		
		String expErrMsg = "Invalid login! Please try again!";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}


	@When("^username password are valid$")
	public void username_password_are_valid() throws Throwable {
		
//		WebElement userTxt = driver.findElement(By.name("userName"));
//		WebElement pwdTxt = driver.findElement(By.name("userPwd"));
//		WebElement loginBtn = driver.findElement(By.className("btn"));
//		userTxt.sendKeys("Supriya");
//		pwdTxt.sendKeys("Supriya");
//		loginBtn.click();
		loginPage.setUserName("Supriya");
		loginPage.setPassword("Supriya");
		loginPage.clickLoginButton();
	}

	@Then("^go to registration form$")
	public void go_to_registration_form() throws Throwable {
		
		driver.navigate().to("D:\\HotelBookingDemo\\hotelbooking.html");
	}

}
