package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.common.base;
import com.pageobjectmodel.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search extends base {
	
	SearchPage sp;
	
	
	@Given("user on home page")
	public void user_on_home_page() {
		browser();
	   /*inheritence */
		
		
		sp=PageFactory.initElements(driver,SearchPage.class);
	}

	@When("user enter QA tesing in search field")
	public void user_enter_qa_tesing_in_search_field() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("QA testing");
	 //a[contains(text(),'Amazon Basics')]
		
		
		WebElement amazon=driver.findElement(By.xpath("//a[contains(text(),'Amazon Basics')]"));
		System.out.println(amazon.getText());
		System.out.println("manu");
	
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

	@Then("user able to go QA testing page")
	public void user_able_to_go_qa_testing_page() {
	 
	}
}
