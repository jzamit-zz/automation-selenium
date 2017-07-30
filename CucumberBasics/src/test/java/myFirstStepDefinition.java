

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class myFirstStepDefinition {
	 WebDriver driver;
	 
	 @Given("^I navigate to TheTestRoom\\.com$")
	    public void i_navigate_to_TheTestRoom_com() throws Throwable {
		// System.setProperty("webdriver.gecko.driver","../../drivers/geckodriver");
	        System. out .println("Going to TheTestRoom.com" );
	        driver = new FirefoxDriver();
	        driver .navigate().to("http://www.thetestroom.com" );
	    }
	    @When("^I navigate to Cucumber Tutorial page$")
	    public void i_navigate_to_Cucumber_Tutorial_page() throws Throwable {
	    	// System.setProperty("webdriver.gecko.driver","../../drivers/geckodriver");
	        System. out .println("Clicking on Cucumber Tutorial Page" );
	        driver .findElement(By.linkText( "Java Cucumber Tutorial")).click();
	    }
	    @Then("^the page title should be visible$")
	    public void the_page_title_should_be_visible() throws Throwable {
	    	 //System.setProperty("webdriver.gecko.driver","../../drivers/geckodriver");
	        System. out .println("Checking page title" );
	        System. out .println(driver .getTitle());
	        driver .quit();
	    }

	 
}
