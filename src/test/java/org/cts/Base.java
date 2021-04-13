package org.cts;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	

	public static WebDriver driver;
	
	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\MikeWspac\\TestngSample\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}
	
	public static void loadurl(String url) {
		driver.get(url);
		
	}
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	public static void Timewait() throws InterruptedException {
		Thread.sleep(5000);

	}
	public static void switchwindow(String id) {
		driver.switchTo().window(id);
		
	}
	public static void getwindow() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

	}
	public void getwindlowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}
	public static WebElement locatorbyid(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;	
		
	}
	public static WebElement locatorbyxpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}
	public static void type(WebElement e, String data) {
		e.sendKeys(data);

	}
	public static void click(WebElement element) {
		element.click();
		

	}
	
	public static void screnshot() throws IOException {
		TakesScreenshot s = (TakesScreenshot)driver;
		File loc = s.getScreenshotAs(OutputType.FILE);
		System.out.println(loc);
		File destfile = new File("D:\\MikeWspac\\TestngSample\\target\\mike.png");
		FileUtils.copyFile(loc, destfile);
	}
		public static void selectbyindex(WebElement element ,int index) {
			Select s = new Select(element);
			s.selectByIndex(index);
			// TODO Auto-generated method stub

		}


}
