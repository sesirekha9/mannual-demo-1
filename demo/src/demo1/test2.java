package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver",
	            "C://Users//ADMIN//Downloads//chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
