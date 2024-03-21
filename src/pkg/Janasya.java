package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	ChromeDriver driver;
	String baseurl="https://www.janasya.com";
	@Before
	public void setUp()
	{
	 driver=new ChromeDriver();	
	 driver.get(baseurl);
	}
	
	@Test
	public void titleverification()
	{
		driver.findElement(By.xpath("//*[@id=\"Search-In-Modal\"]")).sendKeys("purple");
	}

}
