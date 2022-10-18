package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class example3guru {
	
	public static String tour="https://demo.guru99.com/test/newtours/";
	WebDriver guru;
	String K;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		guru =new ChromeDriver();
		guru.get(tour);
		Thread.sleep(3000);
		K=guru.getTitle();
		 System.out.println(K);
	}
	@Test(enabled=true,priority=0)
	public void Testcase1() throws InterruptedException
	{
		
		
		 		guru.findElement(By.name("userName")).sendKeys("user");
		guru.findElement(By.name("password")).sendKeys("user");
		guru.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	}
	@Test(enabled=true,priority=1)
	public void Testcase2() {
		
		guru.findElement(By.linkText("REGISTER")).click();
		guru.findElement(By.name("firstName")).sendKeys("maha");
		guru.findElement(By.name("lastName")).sendKeys("lakshmi");
		guru.findElement(By.name("phone")).sendKeys("961128903");
		guru.findElement(By.name("userName")).sendKeys("lucky20@gmail.com");
		Select ted= new Select(guru.findElement(By.name("country")));
		ted.selectByVisibleText("ANTARCTICA"); //(WORKING)
		ted.selectByIndex(6);//(WORKING)
		ted.selectByValue("ANGOLA");//(WORKING)
		
		
		
		guru.findElement(By.name("email")).sendKeys("maha20");
		guru.findElement(By.name("password")).sendKeys("maha@123");
		guru.findElement(By.name("confirmPassword")).sendKeys("maha@123");
		guru.findElement(By.name("submit")).click();
		
	}
		
	@AfterTest(enabled=true)
	public void aftertest() throws InterruptedException
	{
		
		System.out.println(guru.getCurrentUrl());
		
		guru.close();
		
}
}