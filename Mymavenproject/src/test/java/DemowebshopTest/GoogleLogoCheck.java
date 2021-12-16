package DemowebshopTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleLogoCheck {
	WebDriver driver;
	@BeforeTest
	public void openurl()
	{
		System.out.println("openurl");
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void checkurl()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle,"google");
	}
	@Test(priority=1)
	public void checklogo()
	{
		boolean view=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(view);
	}
	@AfterTest
	public void closebrowser()
	{
		System.out.println("browser closed");
		driver.close();
	}
}

