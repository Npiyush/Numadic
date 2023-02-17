package Testpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.DropDown;
import Pages.FormPage;
import Utilities.UtilitiesMethods;

public class Test3 extends Base
{
	@Test

	public void IfnoticePeriodIsEmptyFormCantSubmit() throws InterruptedException, AWTException
	{
		
		 dropdown =new DropDown(driver);
		 driver.get("https://jobs.numadic.com/jobs/Careers/53264000000375218/QA-Engineer?source=CareerSite");
		 UtilitiesMethods.WaitImpli(driver);
		 dropdown.intrested().click();
		 formPage = new FormPage(driver);
		 
		 Thread.sleep(5000);
         formPage.drop().click();
         Actions s=new Actions(driver);
         s.moveToElement( formPage.selectmr()).click().build().perform();
         formPage.Fname().sendKeys("Piyush");
         Thread.sleep(2000);
         formPage.LName().sendKeys("Narlawar");
         formPage.email().sendKeys("piyush.narlawar19@gmail.com");
         formPage.mobile().sendKeys("7387990147");
         formPage.address().sendKeys("Sara Gaurav");
         formPage.country().sendKeys("india");
         formPage.currentEmployer().sendKeys("Fujitsu");
         formPage.currentCtc().sendKeys("480000");
         formPage.ExpectedCtc().sendKeys("800000");
         formPage.reason().sendKeys("carrier Growth");
         formPage.why().sendKeys("Better Opportunities");
         formPage.social().sendKeys("linkedin.com");
         Thread.sleep(2000);
         formPage.city().sendKeys("Aurangabad Cantonment, Aurangabad, Aurangabad, Maharashtra, India - 431002");
         formPage.city().sendKeys(Keys.ENTER);
         formPage.state().sendKeys("Maharashtra");
         formPage.zipcode().sendKeys("431136");
         formPage.zipcode().sendKeys(Keys.ENTER);
        
         Thread.sleep(10000);
         formPage.currentjobtitle().click();
         //Thread.sleep(20000);
         s.moveToElement(formPage.projectlead()).perform();
         Thread.sleep(10000);
         s.click().perform();
         Thread.sleep(10000);
         
        /* Thread.sleep(10000);
         formPage.currentjobtitle().click();
         
         WebDriverWait  wait=new  WebDriverWait(driver,Duration.ofSeconds(30));
         wait.until(ExpectedConditions. invisibilityOfElementLocated(By.xpath("//lyte-drop-item[@data-zcqa='Current Job Title_Project-Lead']")));
        // Thread.sleep(10000);
         s.moveToElement(formPage.projectlead()).perform();
         Thread.sleep(10000);
         s.click().perform();*/
         
         
         
         formPage.skills().sendKeys("Functional testing");
         formPage.funct().click();
         formPage.skills().click();
         
         Thread.sleep(10000);
         
         
        String CSVFile ="C:\\Users\\dell\\Piyush Resume.pdf";
        formPage.browse().click();
        
        StringSelection ss = new StringSelection(CSVFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
       
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        Thread.sleep(10000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        formPage.submit().click();
        
        boolean error=formPage.error().isDisplayed();
        System.out.println(error);
        SoftAssert soft = new SoftAssert();
    	soft.assertTrue(error);
    	soft.assertAll();
	}
}
