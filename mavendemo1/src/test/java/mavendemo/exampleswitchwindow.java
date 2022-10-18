package mavendemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exampleswitchwindow {
	
	public static String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String url1= "https://www.facebook.com\\";
	
	@Test
	public void testcase1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		String beforelogin=driver.getCurrentUrl();
		System.out.println(beforelogin);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String afterlogin =driver.getTitle();
		Thread.sleep(3000);
		driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to(url1);
		
}
	}
			

