package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class example2 {
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
	@Test(enabled=true)
		public void Testcase1() throws InterruptedException
	{
		WebElement Username =driver.findElement(By.xpath("//*[@placeholder='Username']"));
		
		if(Username.isEnabled())
		{
			Username.sendKeys("Admin");
			
			
		}
		WebElement Password = driver.findElement(By.xpath("//*[@name='password']"));
		if(Password.isDisplayed())
		{
			Thread.sleep(3000);
			Password.sendKeys("admin123");
			Thread.sleep(2000);
			// FOR SUBMITING 
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			Thread.sleep(2000);
		
		}
		// FOR DROPDOWN
driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(2000);
		//FOR LOGOUT
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		Thread.sleep(2000);
		
		// FOR MAINTAINACE
		/*driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-form-row'][2]//div//div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();*/			
		
	}

	/*
	 * @Test(priority=0,enabled=true) public void Testcase2() throws
	 * InterruptedException {
	 * 
	 * 
	 * //driver.findElement(By.name("username")).sendKeys("Admin");
	 * driver.findElement(By.name("password")).sendKeys("admin123");
	 * driver.findElement(By.xpath("//button[@type='submit']")).click();
	 * Thread.sleep(2000);
	 * 
	 * }
	 */
	@AfterTest
	public void AT() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	}




