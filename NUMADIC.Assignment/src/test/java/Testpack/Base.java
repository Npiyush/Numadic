package Testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.DropDown;
import Pages.FormPage;
import Pages.Home;
import Utilities.UtilitiesMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	DropDown dropdown;
	FormPage formPage;
	
	Home home;
	public static WebDriver driver;
	@BeforeTest

	public void Launching() 
	{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://jobs.numadic.com/jobs/Careers");
	 dropdown =new DropDown(driver);
		
	
	 
	}

	@AfterTest

	public void Quit() 
	{
		driver.quit();
		System.gc();
	}
	

}
