package com.stepdefinition;

import org.openqa.selenium.By;

import com.common.basesecond;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class secondsearch extends basesecond{




@Given("user on youtube home page")
public void user_on_youtube_home_page() {
  browser();
}

@When("user write malayalam song")
public void user_write_malayalam_song() {
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Ethrayo Janmamayi... | | HD 1080p Video Song | Summer in Bethelehem | Vidyasagar Magic");
	
	
   
}

@When("click to search button")
public void click_to_search_button() {
driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

}

@Then("user able to see malayalam song")
public void user_able_to_see_malayalam_song() {
	driver.findElement(By.xpath("//div[@id='search-input']")).click();
  
}}