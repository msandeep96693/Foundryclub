package ObjectPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagecreateIncentives {
	
	private WebDriver driver;

	public PagecreateIncentives(WebDriver driver) {				
	super();
	this.driver = driver;		
	PageFactory.initElements(driver, this);	
	}	
	
	@FindBy(xpath = "//span[.=' Incentives ']") private WebElement leftnavigationIncentivebutton;
	
	
	@FindBy(xpath = "//app-add-button[@mattooltip='Add Incentive']/button") private WebElement createincentiveplusbutton;
	
	// common xpath for text field label identification
	@FindBy(xpath = "//mat-form-field/div/div/div/label/mat-label ") private List<WebElement> Alllabelvalidation;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='mini_club'] ") private WebElement clickonminiclubdropdown;
//	@FindBy(xpath = "//div[@id='mat-select-4-panel']/div/mat-option ") private List<WebElement> Allminiclubdropdownoptions;
	@FindBy(xpath = "//div[@role='listbox']") private List<WebElement> dropdownoptionlist;
	
	@FindBy(xpath = "//input[@placeholder='Enter title'] ") private WebElement Enterthetitleintothetextfield;
	
	@FindBy(xpath = "//button[@aria-label='Open calendar']") private WebElement calenderstartandenddate;
	@FindBy(xpath = "//button[@aria-label='Choose month and year'] ") private WebElement clickonmonthandyearcombined;
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button") private List<WebElement> calenderyearlist;
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button") private List<WebElement> monthlist;
	@FindBy(xpath = "//tbody[@class='mat-calendar-body']/tr/td/button") private List<WebElement> daylist;
	
	@FindBy(xpath = "//p[.='Upload an Image'] ") private WebElement uploadanimage;
	@FindBy(xpath = "//input[@formcontrolname='max_submissions']") private WebElement maxsubmissiontextfield;
	@FindBy(xpath = "//input[@formcontrolname='eligible_winners']") private WebElement eligiblewinnertextfield;
	@FindBy(xpath = "//input[@formcontrolname='winner_title']") private WebElement winnertitletextfield;
	@FindBy(xpath = "(//mat-select[@role='combobox'])[2]") private WebElement countryselect;
	@FindBy(xpath = "//div[@id='mat-select-6-panel']/mat-option") private List<WebElement> currencyoptionselection;
	@FindBy(xpath = "//input[@formcontrolname='winner_amount']") private WebElement winneramounttextfield;
	@FindBy(xpath = "//input[@formcontrolname='link']") private WebElement linktextfield;
	@FindBy(xpath = "//textarea[@formcontrolname='details'] ") private WebElement Enterdetailstextarea;
	@FindBy(xpath = "(//span[.='Create'])[2]") private WebElement createbutton;

	
	public void LeftnvigationIncentiveButton() 
	{
		leftnavigationIncentivebutton.click();
	}

	
	public void clickonincentiveaddbutton() 
	{
		createincentiveplusbutton.click();
	}
	
	public void Dropdownlabelnamevalidation(String titlename) 
	{
		for(WebElement Nameslist : Alllabelvalidation)
		{
			String incentiveslabelnames = Nameslist.getText();
			if(incentiveslabelnames.equals(titlename))
			{
				clickonminiclubdropdown.click();
			} 
			else if(incentiveslabelnames.equals(titlename)) 
			{
				countryselect.click();
			}
			
		}
	}
	
	public void selectionofdropdownoptionlist(String Optionname)
	{
		for(WebElement dropdownoption : dropdownoptionlist)
		{
			String optionslist = dropdownoption.getText();
			if(optionslist.equals(Optionname))
			{
				dropdownoption.click();
			} 
		}
	}
	
	public void Allcomponenttextfieldlabelnamevalidation(String titlename,String Incentivename,int MaxsubmissionNumber,int eligiblewinner, 
			                               int winneramount, String    WinnerTitlename,String link, String incentivedetails)
			                                              
	{
		for(WebElement Nameslist : Alllabelvalidation)
		{
			String incentiveslabelnames = Nameslist.getText();
			if(incentiveslabelnames.equals(titlename))
			{
				Enterthetitleintothetextfield.sendKeys(Incentivename);
			}
			else if(incentiveslabelnames.equals(titlename))
			{
				maxsubmissiontextfield.sendKeys(Integer.toString(MaxsubmissionNumber));
			} 
			else if(incentiveslabelnames.equals(titlename))
			{
				eligiblewinnertextfield.sendKeys(Integer.toString(eligiblewinner));
			}
			else if(incentiveslabelnames.equals(titlename))
			{
				winnertitletextfield.sendKeys(WinnerTitlename);
			}
			else if(incentiveslabelnames.equals(titlename))
			{
				winneramounttextfield.sendKeys(Integer.toString(winneramount));
			}
			else if(incentiveslabelnames.equals(titlename))
			{
				linktextfield.sendKeys(link);
			}
			else if(incentiveslabelnames.equals(titlename))
			{
				Enterdetailstextarea.sendKeys(incentivedetails);
			}
//			else if(incentiveslabelnames.equals(titlename)) 
//			{
//				calenderstartandenddate.click();
//			}
		}
	}
	
	public void Actionsoncalenderstartandenddatefields(String titlename)
	{
		for(WebElement Nameslist : Alllabelvalidation)
		{
			String incentiveslabelnames = Nameslist.getText();
			if(incentiveslabelnames.equals(titlename))
			{
				
			} 
		}
	}
	
}


