package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get(baseurl);
	}
	@Test
	public void contentverification()
	{
		String src=driver.getPageSource();
		if(src.contains("Full Name"))
		{
			System.out.println("full name label is present");
		}
		else
		{
			System.out.println("not present");
		}
		
	}

	
	@Test
	public void buttontextverification()
	{
		String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
		if(buttontext.equals("Create my account >>"))
		{
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}
	}
}
