package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown 
{
	public WebDriver driver;
	
	public DropDown(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy (xpath="//div[@class=\"lyteDummyEventContainer\"]//lyte-drop-button")
	  private WebElement dropdown ;
	  
	 @FindBy (xpath="//lyte-drop-item[text()='Engineering']")
	  private WebElement engineering ;
	 
	 @FindBy (xpath="//a[text()='QA Engineer']")
	  private WebElement Qaengineer ;
	 
	 @FindBy (xpath="(//button[@type='button'])[3]")
	  private WebElement intrested ;
	 
	 public WebElement dropdown()
	 {
		return dropdown;
		 
	 }
	 
	 public WebElement Engineering()
	 {
		return engineering;
		 
	 }
	 public WebElement QaEngineer()
	 {
		return Qaengineer;
		 
	 }
	 
	 public WebElement intrested()
	 {
		return intrested;
		 
	 }
}
