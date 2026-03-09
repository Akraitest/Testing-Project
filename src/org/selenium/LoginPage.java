package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		// driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		// driver.findElement(By.xpath("//input[@id='login-button']")).click();
		// driver.close();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Thread.sleep(1000);
		String gettitle = driver.getTitle();
		System.out.println(gettitle);
		Thread.sleep(1000);
		String getpagesource = driver.getPageSource();
		System.out.println(getpagesource);

		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();	
		driver.close();
	}
}