package testNG;

import org.testng.annotations.Test;

public class Priority_order {

		@Test (priority=4)
		public void performSearchAndClick1stLink() {
			System.out.println("performSearchAndClick1stlink");
		}
		
		@Test (priority=0)
		public  void doInitialSetup() {
			System.out.println("doInitialSetup");
		}
	

		@Test (priority=1)
		public  void openBrowser() {
			System.out.println("openBrowser");
		}
		
		@Test (priority=-1)
		public  void test() {
			System.out.println("test -1 value");
		}
		
		@Test (priority=2)
		public  void launchgGoogle() {
			System.out.println("launchgGoogle");
		}
		
		@Test (priority=3)
		public  void FacebookpageTitleVerification() {
			System.out.println("FacebookpageTitleVerification");
		}
		
		
		
}
