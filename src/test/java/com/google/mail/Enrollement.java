package com.google.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Enrollement {
	
	@Test

	public void home() {
		
		System.out.println("Test is start");

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://sfa@ciklum.com:Ciklum@3865@172.16.2.20:8090/";
		driver.get(url);
		driver.manage().window().maximize();
		
		sleep(2000);
		
		
	//Verification
		
		String username=driver.findElement(By.xpath("/html//div[@id='custom-bootstrap-menu']//ul[@class='nav navbar-nav navbar-right']//a[@role='button']")).getText();
		System.out.println(username+ "  is logged in");
		driver.quit();		 

	}
	


	private void sleep(long s) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
