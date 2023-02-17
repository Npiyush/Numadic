package Testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.DropDown;
import Pages.FormPage;
import Utilities.UtilitiesMethods;

public class Test2 extends Base
{
	
	
@Test

public void verificationOfPageTitleNumadic() throws InterruptedException
{
	 dropdown =new DropDown(driver);
	
	UtilitiesMethods.WaitImpli(driver);
	 Actions s=new Actions(driver);
	
	dropdown.dropdown().click();
	s.moveToElement(dropdown.Engineering()).perform();
	s.click().perform();
	dropdown.QaEngineer().click();
	System.out.println(driver.getTitle());
	
	Assert.assertEquals("Numadic Iot Pvt. Ltd. - QA Engineer in",driver.getTitle());
}
@Test
public void verificationOfinterestedbutton()
{
	
	boolean intreastedButton =dropdown.intrested().isDisplayed();
	System.out.println(intreastedButton);
	SoftAssert soft = new SoftAssert();
	soft.assertTrue(intreastedButton);
	soft.assertAll();
	
	if(intreastedButton )
	{
		dropdown.intrested().click();
	}
	else
	{
		System.out.println("Intereasted button not present");
	}
	
}

}
