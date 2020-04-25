package com.mystudy.bdd.gotour.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="resources/features",
		glue= {"com.mystudy.bdd.gotour.org.steps"}
		)

public class TestRunner {
	
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
