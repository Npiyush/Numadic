package Testpack;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Home;
import Utilities.UtilitiesMethods;

public class Test1 extends Base
{
@Test

public void  HeaderTextVerfication()
{
	Home home=new Home(driver);
	UtilitiesMethods.WaitImpli(driver);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Assert.assertEquals("JOIN OUR CREW", home.Crew().getText());
}

}
