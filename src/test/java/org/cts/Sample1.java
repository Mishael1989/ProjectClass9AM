package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample1 extends Base{
	
		
		
		@Test
		private void tc0() {
			WebElement name = driver.findElement(By.id("email"));
			name.sendKeys("java");
					String attribute = name.getAttribute("value");
					Assert.assertEquals("jaa", attribute);
			
			
		

	}
		@Test
		private void tc1() {
			System.out.println("end");
			
		}
		
		
		@Test
		 public void tc2() {
			System.out.println("done");
		}

}
