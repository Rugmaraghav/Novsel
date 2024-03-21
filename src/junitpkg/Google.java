package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

		ChromeDriver driver;
		String baseurl="https://www.google.com";
		
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
			driver.manage().window().maximize();
		}
		
		@Test
		public void test()
		{
			
			
			WebElement search=driver.findElement(By.name("q"));
			
			search.sendKeys("books",Keys.ENTER);
			//search.submit();
			driver.navigate().back(); // navigate to back page 
			
		}
		

	

}
