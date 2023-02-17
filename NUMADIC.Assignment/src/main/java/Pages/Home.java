package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home
{
	public WebDriver driver;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  @FindBy (xpath="//h2[@data-zrqa='cw-bg2-stitle']")
  private WebElement Crew;
  
  public WebElement Crew()
  {
	return Crew;
	  
  }
}
