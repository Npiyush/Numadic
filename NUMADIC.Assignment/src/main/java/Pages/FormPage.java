package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage 
{
public WebDriver driver;
	
	public FormPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//lyte-drop-button[@data-zcqa='manual_Salutation']")
	  private WebElement drop ;
	
	@FindBy (xpath="//lyte-drop-item[@id='Lyte_Drop_Item_1']")
	  private WebElement selectmr ;
	
	@FindBy (xpath="//input[@class='cxBorderBottom '][1]")
	  private WebElement Fname ;
	
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[2]")
	  private WebElement LName ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[3]")
	  private WebElement email ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[4]")
	  private WebElement mobile ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[5]")
	  private WebElement address ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[6]")
	  private WebElement country ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[7]")
	  private WebElement currentEmployer ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[8]")
	  private WebElement currentCtc ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[9]")
	  private WebElement ExpectedCtc ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[10]")
	  private WebElement reason ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[11]")
	  private WebElement why ;
	@FindBy (xpath="(//input[@class='cxBorderBottom '])[12]")
	  private WebElement social ;
	
	
	
	@FindBy (xpath="(//input[@id='inputId'])[1]")
	  private WebElement city ;
	@FindBy (xpath="(//input[@id='inputId'])[2]")
	  private WebElement state ;
	@FindBy (xpath="(//input[@id='inputId'])[3]")
	  private WebElement zipcode ;
	
	@FindBy (xpath="//lyte-drop-button[@data-zcqa='manual_Current_Job_Title']")
	  private WebElement currentjobtitle ;
	@FindBy (xpath="//lyte-drop-item[@data-zcqa='Current Job Title_Project-Lead']")
	  private WebElement projectlead ;
	
	
	@FindBy (xpath="//input[@id='addSkills']")
	  private WebElement skills ;
	
	@FindBy (xpath="//li[text()='functional testing']")
	  private WebElement funct ;
	
	@FindBy (xpath="//input[@class='f15 ']")
	  private WebElement notice ;
	
	@FindBy (xpath="(//lyte-file-message[@class='lyteFileUpdMsgWrap'])[2]")
	  private WebElement browse ;
	
	@FindBy (xpath="//button[@type='submit']")
	  private WebElement submit ;
	
	
	@FindBy (xpath="//span[text()='Notice Period (days) cannot be empty.']")
	  private WebElement error ;
	
	public WebElement  selectmr()
	 {
		return  selectmr; 
	 }
	public WebElement   Fname()
	 {
		return   Fname; 
	 }
	public WebElement   LName()
	 {
		return   LName; 
	 }
	public WebElement  country()
	 {
		return country; 
	 }
	public WebElement   email()
	 {
		return   email; 
	 }
	public WebElement  mobile()
	 {
		return  mobile; 
	 }
	
	 public WebElement drop()
	 {
		return drop; 
	 }
	 public WebElement   address()
	 {
		return   address; 
	 }
	 public WebElement   currentEmployer()
	 {
		return   currentEmployer; 
	 }
	 public WebElement   ExpectedCtc()
	 {
		return   ExpectedCtc; 
	 }
	 public WebElement   currentCtc()
	 {
		return   currentCtc; 
	 }
	 public WebElement   reason()
	 {
		return  reason; 
	 }
	 public WebElement   why()
	 {
		return  why; 
	 }
	 public WebElement   social()
	 {
		return   social; 
	 }
	 
	 public WebElement  city()
	 {
		return  city; 
	 }
	 public WebElement  state()
	 {
		return  state; 
	 }
	 public WebElement  zipcode()
	 {
		return  zipcode; 
	 }
	
	 

		public WebElement  currentjobtitle()
		 {
			return  currentjobtitle; 
		 }

		public WebElement  projectlead()
		 {
			return   projectlead; 
		 }
		
		public WebElement   skills()
		 {
			return   skills; 
		 }
		
		public WebElement   funct()
		 {
			return   funct; 
		 }
		
		public WebElement   notice()
		 {
			return  notice; 
		 }
		
		public WebElement   browse()
		 {
			return   browse; 
		 }
		
		public WebElement   submit()
		 {
			return  submit; 
		 }
		
		public WebElement   error()
		 {
			return   error; 
		 }
}
