package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BrowserOperations;
import com.base.FileOperation;
import com.page.LoginD2HPage;

public class LoginTest {

	WebDriver driver;

	@Test(priority = 0)
	public void loginTestMethod() throws Exception {
		BrowserOperations browserOperations = new BrowserOperations();
		driver = browserOperations.LaunchApplication("Firefox");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actualTitle = browserOperations.getTitleOfBrowser();
		System.out.println(actualTitle);
	}

	@Test(priority = 1)
	public void login() throws Exception {

		LoginD2HPage loginD2HPage = new LoginD2HPage(driver);

		loginD2HPage.frameHandle();
		loginD2HPage.accountLogin();
		loginD2HPage.frameHandle1();

	}

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}

