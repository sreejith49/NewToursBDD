package com.mystudy.bdd.gotour.org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mystudy.bdd.gotour.org.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends TestRunner{
	
	@Given("^when user navigates to newTours application$")
	public void given_condition() {
		
		WebElement welcomeIcon = driver.findElement(By.xpath("//img[@alt='Mercury Tours']"));
		
		if(welcomeIcon.isDisplayed()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}
	
	@When("^user provides valid username and password$")
	public void user_provides_valid_username_and_password() {
	   
		driver.findElement(By.name("userName")).sendKeys("jamesjojo");
		driver.findElement(By.name("password")).sendKeys("beans");
		
	}
	
	@When("^clicks on the submit button$")
	public void clicks_on_the_submit_button() {
	   
		driver.findElement(By.cssSelector("input[name='login']")).click();
	}

	@Then("^user should get redirected to flight finder page$")
	public void user_should_be_get_redirected_to_flight_finder_page() {
	    
	}


}
