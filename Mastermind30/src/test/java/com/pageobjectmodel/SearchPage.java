package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
public WebDriver driver;

	public SearchPage(WebDriver driver) {
		
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
		
		
		
		
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchField;
	public void getSearchfield() {
		searchField.sendKeys("QA testing book");		
	}
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchbutton;
	public void getbutton() {searchbutton.click();}
	
	
	
	
	
	
}
