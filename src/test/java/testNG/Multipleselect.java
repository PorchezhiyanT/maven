package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multipleselect {

	@Test
	public void miltiple_Select()
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
	driver.manage().window().maximize();
	
	WebElement mms = driver.findElement(By.id("cars"));
	
	Select ms = new Select(mms);
	ms.selectByIndex(0);
	ms.selectByIndex(1);
	ms.selectByIndex(2);
	ms.selectByIndex(3);
	
//	List<WebElement> list=ms.getAllSelectedOptions();
//	
//	for (WebElement obj:list)
//	{
//		System.out.println(obj.getText());
//	}
	}
	

}
