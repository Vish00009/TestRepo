package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver =new ChromeDriver();

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on Login Page");

	}

	@When("user enters user1 and pass1")
	public void user_enters_user1_and_pass1() {
		System.out.println("User enters login and password details");

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("User is on Login Page");

	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("User is on Login Page");

	}

	@When("user enters user2 and pass2")
	public void user_enters_user2_and_pass2() {
		System.out.println("User is on Login Page");
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);


		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement link= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	}
}
