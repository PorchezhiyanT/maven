package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_login
{
	@Test
	public void browserlaunch()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("chezhiyan1710@gmail.com");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Porchezhiyan");
	
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
	
	boolean inputValue = title.contains("Facebook");
	System.out.println(inputValue);
	
			
	
	 
		
	}

}
