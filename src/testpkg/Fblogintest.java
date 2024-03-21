package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FBloginpage;

public class Fblogintest extends Baseclass {
	
	
	@Test
	public void test()
	{
		FBloginpage ob=new FBloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.loginclick();
	}

}
