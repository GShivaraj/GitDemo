package TestNG;

import org.testng.annotations.Test;

public class Groups {
	
	
	@Test(groups= {"smoke"})
	
	public void test4() {
		System.out.println("smoke");
		System.out.println("smoke1");
		System.out.println("smoke2");
	}

	@Test(groups= {"smoke","functional","sanity", "ios.smoke"})
	public void test5() {
		System.out.println("functional");
		System.out.println("functional1");
		System.out.println("functional"2);
	}

	@Test(groups= {"functional", "regression","windows.functional","ios.functional"})
	public void test6() {
		System.out.println("regression");
		System.out.println("regression1");
		System.out.println("regression2");
		System.out.println("regression3");
	}

	@Test
	public void test7() {
		System.out.println("ios.functional");
	}

}
