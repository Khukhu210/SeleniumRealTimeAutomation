package com.test.loginoperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.test.baseoperation.BrowserOperations;
import com.test.pageoperation.LoginD2HPage;

public class LoginApplication {

	WebDriver driver;

	@Test(priority = 0)
	public void initializeDriver() throws Exception {
		BrowserOperations browserOperations = new BrowserOperations();
		driver = browserOperations.launchApplication("Firefox");

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
}

/*
 * @Test(priority = 2) public void tearDown() {
 * 
 * driver.quit(); }
 * 
 * }
 */

