package junitpkg;




import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	ChromeDriver driver;
	String baseurl="https://www.instagram.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void fblogin() throws InterruptedException
	{
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
		WebElement pswd=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		pswd.sendKeys("avv");
		pswd.submit();
		//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		
	}

}
