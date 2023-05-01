package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	
	@Test
	public void browserlaunch()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println("Title-->"+title);
	
	boolean inputValue = title.contains("Facebook");
	System.out.println("Boolean-->"+inputValue);
		
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("chezhiyan1710@gmail.com");
	String username  = email.getAttribute("value");
	System.out.println("username-->"+username);
	
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Porchezhiyan");
	String passWord = password.getAttribute("value");
	System.out.println("passWord-->"+password);
	
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
	
	

	//Assert
//	Assert.assertEquals(inputValue,"This is my title test case");
	
	
	SoftAssert softAssertobj = new SoftAssert();
	softAssertobj.assertEquals("grees@gmail.com",username,"Verified email");
	
	softAssertobj.assertAll();
	
	 
		
	}


}
