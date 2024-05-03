package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class googlestepdef {
	public WebDriver driver;
	public String act1;
	@Given("Browser should open app should launch")
	public void browser_should_open_app_should_launch() {
	 driver = new ChromeDriver();
	 driver.get("https://www.google.co.in/");
	}

	@When("User captures Title of google page")
	public void user_captures_title_of_google_page() {
		act1=driver.getTitle();
		
	}

	@Then("Expected and Actual Title should match")
	public void expected_and_actual_title_should_match() {
		if(act1.contains("Google"))
		{
			System.out.println("tc is passed");
		}
		else {
			System.out.println("tc is failed");
		}
	   
	}

}
