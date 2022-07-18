package TestNG;

import org.testng.annotations.Test;

public class Groups {
	
	
	@Test(groups= {"smoke"})
	
	public void test4() {
		System.out.println("smoke");
	}

	@Test(groups= {"smoke","functional","sanity", "ios.smoke"})
	public void test5() {
		System.out.println("functional");
	}

	@Test(groups= {"functional", "regression","windows.functional","ios.functional"})
	public void test6() {
		System.out.println("regression");
	}

	@Test
	public void test7() {
		System.out.println("ios.functional");
	}

}
