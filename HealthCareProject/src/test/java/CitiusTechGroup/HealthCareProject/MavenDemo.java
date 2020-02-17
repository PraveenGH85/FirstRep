package CitiusTechGroup.HealthCareProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenDemo 
{
	@Test
	public void test1()
	{
		System.out.println("Test1 start");	
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/login.cfm");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 start");		
	}	
}

