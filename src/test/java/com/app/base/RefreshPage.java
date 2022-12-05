package com.app.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshPage {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Oct_Sample\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/"); 
			driver.manage().window().maximize();
			
		    WebElement gmail = driver.findElement(By.linkText("Gmail"));
		    
		    Actions ac = new Actions(driver);
		    Thread.sleep(3000);
		    ac.contextClick(gmail).perform();
		    
//		    ac.doubleClick(gmail).perform();	
		}
		}
