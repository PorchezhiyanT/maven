package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngData_provider {

	@Test(dataProvider="testData")
	private void test(String name, String password) {
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	@DataProvider(name="testData")
	private Object[][] testcase(){
		Object [][] objName = new Object[][] {
			{"123@gmail","qetrrt"},
			{"3444@gmail","jkjkj"},
			{"abc","123"},
			{"xyz","789"}
		};
		return objName;
	}
}
