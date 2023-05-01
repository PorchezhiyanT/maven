package testNG;

import org.testng.annotations.Test;

public class Enable {
	
	@Test
	public void open() {
		System.out.println("open the browser");
	}
	
	@Test
	public void login() {
		System.out.println("enter details and login");
	}

	@Test (enabled=false)    //using this test for won't be execute
	public void exit() {
		System.out.println("close the browser");
	}
}
