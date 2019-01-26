package com.testproject.demogithub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  	 
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.inviul.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		System.out.println("Title is- "+driver.getTitle());
		
		driver.close();
		
		driver.quit();

	}

}
