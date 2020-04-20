package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.FileOperation;

public class LoginD2HPage {

	WebDriver driver;

	public LoginD2HPage(WebDriver driver) {
		this.driver = driver;
	}

	public void frameHandle() {

		WebElement frame = driver.findElement(By.xpath("//img[@src='/assets/images/close-icon.png']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", frame);
	}

	public void accountLogin() throws Exception {
		FileOperation fop = new FileOperation();

		driver.findElement(By.id("email")).sendKeys(fop.readPropertyFile("username"));
		driver.findElement(By.id("lpassword")).sendKeys(fop.readPropertyFile("password"));
		driver.findElement(By.id("submit")).click();

	}

	public void frameHandle1() {
		WebElement frame1 = driver.findElement(By.xpath("//img[@src='/assets/images/login/img-2.jpg']"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", frame1);
	}

}
