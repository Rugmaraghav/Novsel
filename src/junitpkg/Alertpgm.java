package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
	ChromeDriver driver;
	String baseurl="file:///E:/Rugma/selenium%20notes/alert.html";
	@Before
	public void setUp()
	{
	 driver=new ChromeDriver();	
	 driver.get(baseurl);
	}
	
	@Test
	public void titleverification()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
	
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext="+alerttext);
		a.accept();
		//a.dismiss();//to cancel alert
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("cd");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
