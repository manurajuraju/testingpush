package com.codepractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TakingScreenshot {
	
	public static void screenshot(WebDriver driver,String s) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File(s+".png"));
	}
	
	//ClassName 	reference variable =  	new  ClassName();	<<<<<< object creation 
	//TakingScreenshot	manu 		= 		new TakingScreenshot();

}
