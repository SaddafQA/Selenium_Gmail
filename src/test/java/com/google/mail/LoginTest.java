package com.google.mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	
	public void login() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "4tgrhttp://mail.google.com";
		driver.get(url);

		driver.manage().window().maximize();
		System.out.println("Page is open");
		sleep(4000);
		
		
		driver.close();
		
	}

	private void sleep(long s) {
		try {
			Thread.sleep(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
