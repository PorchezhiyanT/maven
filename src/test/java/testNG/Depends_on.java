package testNG;

import org.testng.annotations.Test;

public class Depends_on {
	
	@Test
	public void Center() {
		System.out.println("C = 3");
	}
	
	@Test 
	public void Blogin() {
		System.out.println("B = 2");
	}
	

	@Test  (dependsOnMethods = {"Aopen"})   
	public void Dexit() {
		System.out.println("D = 4");
	}
	
	@Test (dependsOnMethods = {"Blogin"}) 
	public void Aopen() {
		System.out.println("A = 1");
	}
}
