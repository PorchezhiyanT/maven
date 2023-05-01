package testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Practise {
	@Test
	public void practisee() throws IOException, InterruptedException{
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	/*	driver.findElement(By.id("home")).click();
		String homeurl = driver.getCurrentUrl();
		System.out.println(homeurl);
		
		driver.navigate().back();
		System.out.println("button"+driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("home"+driver.getCurrentUrl());
		driver.navigate().to("https://amazon.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		File firstsoure = sc.getScreenshotAs(OutputType.FILE);
		File firstdesignation = new File("./Snapshots/sc.png");
	    FileHandler.copy(firstsoure, firstdesignation);
	    Thread.sleep(5000);

	}

}
