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
public class task13 {
	  WebDriver driver;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
	 }
			@Test
			public void Testcase2() {
				
			//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
			
			@Test
			public void Testcase3() {
				driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				List<WebElement> li=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
				System.out.println("Total size of the webelements:"+li.size());
				driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
				System.out.println("User Name:"+driver.findElement(By.xpath("//*[@class='oxd-table-card'][6]//div[2]/div")).getText());
				driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(6).click();
				driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
								
				
			}
			@AfterTest
			public void AT() {
				//Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
				driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.close();
			}
}








