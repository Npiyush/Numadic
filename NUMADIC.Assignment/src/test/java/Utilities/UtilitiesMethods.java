package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class UtilitiesMethods
{
	//public static WebDriver driver;
public static void WaitImpli(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return;
}
}
