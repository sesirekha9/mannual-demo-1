package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";//by using this url we can  automate  web application features 

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",// chrome broswer driver
	            "C://Users//ADMIN//Downloads//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//String beforelogin=driver.getTitle();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]")).click();//(admin)
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[3]")).click();//(job xpath)
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Locations")).click();
		Thread.sleep(2000);
		  Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		
		/*
		 * String afterlogin=driver.getTitle(); if(beforelogin.equals(afterlogin)) {
		 * driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click
		 * (); System.out.println("the title is same so i logout"); }else {
		 * System.out.print("the title of the page is not same"); }
		 */








		

	}

}
