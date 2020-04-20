package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BrowserOperations
{
	WebDriver driver;
	
    public WebDriver  LaunchApplication(String browserName) throws Exception 
	{

		switch (browserName) {

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "IE":
			System.setProperty("webdriver.i.e.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;

		}

		FileOperation fileOperation = new FileOperation();
		driver.get(fileOperation.readPropertyFile("url"));

		return driver;

	}
   // verify title 
    @Test
    public String getTitleOfBrowser()
	{
		String title = driver.getTitle();
	    return title;
	}
}
