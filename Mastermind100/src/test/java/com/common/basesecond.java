package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basesecond{
	
public WebDriver driver;



public void browser() {


WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	
	
}
	
	
	
}