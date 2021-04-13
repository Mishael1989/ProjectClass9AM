package org.cts;

import org.testng.annotations.Test;

public class Groups {
	
	@Test (groups = {"smoke"})
	private void tc0() {
		System.out.println("Method 1");
		
	}
	
	@Test (groups = {"sanity"})
	private void tc1() {
		System.out.println("Method 2");

	}
	
	@Test (groups = {"smoke","E2E"})
	private void tc3() {
		System.out.println("Method 3");

}
	@Test(groups = {"retest"})
	private void tc4() {
		System.out.println("Method 4");

	}
}