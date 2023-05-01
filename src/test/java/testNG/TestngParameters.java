package testNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestngParameters {
	@Test
	@Parameters({"firstname","secondname"})
	public void facebookMethod(String firstname,String secondname) {
		System.out.println("This is facebook"+(firstname+""+secondname));
	}
	
	@Test(groups= {"smokeTest"})
	public void hello() {
		System.out.println("hello");
	}
	
	@Test
	@Parameters({"firstname","secondname"})
	public void abc() {
		System.out.println("This is abc");
	}
	
	@BeforeSuite
	public void  beforeSuite() {
		System.out.println("beforeSuite");
	}
	
	
	

}
