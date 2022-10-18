package mavendemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example4adminuser {
	
	String address="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  WebDriver driver;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get(address);
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			Thread.sleep(3000);
	 }
	@Test(priority=1,enabled=false)
		public void Testcase1() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-form-row'][2]//div//div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();			
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	}
	@Test(priority=0,enabled=true)
	public void Testcase2() throws InterruptedException {
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(3000);
		//driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(8).click();
		//Thread.sleep(3000);
		//driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(8).click();
		List<WebElement> li=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
		System.out.println("Total size of the webelements:"+li.size());
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
		System.out.println("User Name:"+driver.findElement(By.xpath("//*[@class='oxd-table-card'][6]//div[2]/div")).getText());
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(6).click();
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
						
		//Thread.sleep(3000); [.get(6) index value of the attribute]
		//driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(8).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
						
		
		
		
		
				
	}
	@AfterTest (enabled=true)
	public void AT() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		driver.close();
		
	}

}
