package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void  main(String[] args) throws Throwable {
 WebDriverManager.chromedriver().setup();
 
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.com/");
 TakingScreenshot.screenshot(driver, "test");
 
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement source= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
WebElement target= driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));


Actions action=new Actions(driver);
action.moveToElement(source).moveToElement(target).click().build().perform();


//TakingScreenshot t=new TakingScreenshot();
//t.screenshot(driver, "AmazoneSmile");
	}

}
