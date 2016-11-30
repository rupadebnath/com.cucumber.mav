package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("^Open firefox start application$")
	public void Open_firefox_and_start_application() throws Throwable{
		
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	//Adding few comments
	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_valid_username_and_password(String uname, String paswd) throws Throwable{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(paswd);
	}
	
	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable{
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Then("^Application should be closed$")
	public void Application_should_be_closed() throws Throwable{
		driver.quit();
	}

}
