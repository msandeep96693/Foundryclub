package ObjectPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagecreateIncentives {
	
	public WebDriver driver;

	public PagecreateIncentives(WebDriver driver) {				
	super();
	this.driver = driver;		
	PageFactory.initElements(driver, this);	
	}	
	
	@FindBy(xpath = "//span[.=' Incentives ']") private WebElement leftnavigationIncentivebutton;
	
	
	@FindBy(xpath = "//app-add-button[@mattooltip='Add Incentive']/button") private WebElement createincentiveplusbutton;
	
	// common xpath for text field label identification
	@FindBy(xpath = "//mat-form-field/div/div/div/label/mat-label ") private List<WebElement> Alllabelvalidation;
	@FindBy(xpath = "//div[.='Add an Image']") private WebElement addimagelabelvalidation;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='mini_club'] ") private WebElement clickonminiclubdropdown;
//	@FindBy(xpath = "//div[@id='mat-select-4-panel']/div/mat-option ") private List<WebElement> Allminiclubdropdownoptions;
	@FindBy(xpath = "//div[@role='listbox']/div/mat-option") private List<WebElement> miniclubdropdownoptionlist;
	
	@FindBy(xpath = "//input[@placeholder='Enter title'] ") private WebElement Enterthetitleintothetextfield;
	
	@FindBy(xpath = "//button[@aria-label='Open calendar']") private WebElement calenderstartandenddatebutton;
	@FindBy(xpath = "//button[@aria-label='Choose month and year'] ") private WebElement clickonmonthandyearcombined;
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button") private List<WebElement> calenderyearlist;
	@FindBy(xpath = "(//tbody[@class='mat-calendar-body']/tr)//td/button") private List<WebElement> calendremonthlist;
	@FindBy(xpath = "//tbody[@class='mat-calendar-body']/tr/td/button") private List<WebElement> calenderdaylist;
	
	@FindBy(xpath = "//p[.='Upload an Image'] ") private WebElement uploadanimage;
	@FindBy(xpath = "//input[@formcontrolname='max_submissions']") private WebElement maxsubmissiontextfield;
	@FindBy(xpath = "//input[@formcontrolname='eligible_winners']") private WebElement eligiblewinnertextfield;
	
	@FindBy(xpath = "//div[@role='listbox']/mat-option") private List<WebElement> countrycurrencydropdownlist;
	@FindBy(xpath = "//input[@formcontrolname='winner_title']") private WebElement winnertitletextfield;
	@FindBy(xpath = "(//mat-select[@role='combobox'])[2]") private WebElement countryselect;
	@FindBy(xpath = "//div[@id='mat-select-6-panel']/mat-option") private List<WebElement> currencyoptionselection;
	@FindBy(xpath = "//input[@formcontrolname='winner_amount']") private WebElement winneramounttextfield;
	@FindBy(xpath = "//button[@mattooltip='Add Winner']") private WebElement addwinnerbutton;
	
	@FindBy(xpath = "//input[@formcontrolname='link']") private WebElement linktextfield;
	@FindBy(xpath = "//textarea[@formcontrolname='details'] ") private WebElement Enterdetailstextarea;
	@FindBy(xpath = "(//span[.='Create'])[2]") private WebElement createbutton;
	@FindBy(xpath = "//div[.=' Offer New Incentive ']") private WebElement newincentivename;

	
	public void LeftnvigationIncentiveButton()
	{
		leftnavigationIncentivebutton.click();
	}

	
	public void clickonincentiveaddbutton() 
	{
		try
		{
			createincentiveplusbutton.click();
			
		} catch (ElementClickInterceptedException e) 
		{
			createincentiveplusbutton.click();
		}
		
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
	
	public void selectionofminiclubdropdownoptionlist(String Optionname)
	
	{
		try {
			for(WebElement dropdownoption : miniclubdropdownoptionlist)
			{
				String optionslist = dropdownoption.getText();
				if(optionslist.equals(Optionname))
				{
					dropdownoption.click();
				} 
			}
			
		} catch (StaleElementReferenceException e) 
		{
				
				for(WebElement dropdownoption : miniclubdropdownoptionlist)
				{
					String optionlist1 = driver.findElement(By.xpath("//div[@role='listbox']/div/mat-option")).getText();
					if(optionlist1.equals(Optionname))
					{
						dropdownoption.click();
					}
				}		
		}
		
	}
	
	public void selectionofcurrencydropdownoptionlist(String Optionname)
	{
		for(WebElement dropdownoption : countrycurrencydropdownlist)
		{
			String optionslist = dropdownoption.getText();
			if(optionslist.equals(Optionname))
			{
				dropdownoption.click();
			} 
		}
	}
	
	public void Allcomponenttextfieldlabelnamevalidation(String titlename,String Incentivename,int MaxsubmissionNumber,int eligiblewinner, 
			                               int winneramount, String WinnerTitlename,String link, String incentivedetailstext, String addimagetextname)
			                                              
	{
		for(WebElement Nameslist : Alllabelvalidation)
		{
			String incentiveslabelnames = Nameslist.getText();
//			int incentivenumber = Integer.parseInt(incentiveslabelnames);
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
				Enterdetailstextarea.sendKeys(incentivedetailstext);
			}
			else
			{
				String addimage = addimagelabelvalidation.getText();
				if(addimage.equals(addimagetextname))
				{
					uploadanimage.sendKeys("/home/active34/Downloads/photos/A16Z crypto.jpeg");
				}
			}
		}
	}
	 
	public void addwinnerbuttonplusicon()
	{
		addwinnerbutton.click();
	}
	
	public void Actionsoncalenderstartandenddatefields(String titlename, int year, String month, int daydate)
	{
		for(WebElement Nameslist : Alllabelvalidation)
		{
			String incentiveslabelnames = Nameslist.getText();
			if(incentiveslabelnames.equals(titlename))
			{
				try 
				{
					calenderstartandenddatebutton.click();
				} catch (ElementClickInterceptedException e) 
				{
					calenderstartandenddatebutton.click();
				}
				
				clickonmonthandyearcombined.click();
				
				for( WebElement yearlist: calenderyearlist) {
					String yearname = yearlist.getText();
					int yearnumber = Integer.parseInt(yearname);
					if(yearname.equals(yearnumber))
					{
						yearlist.click();
					}
					
				for(WebElement yearmonthlist: calendremonthlist) 
					{
						String monthname = yearmonthlist.getText();
						if(monthname.equals(month))
						{
							yearmonthlist.click();
						}
					}					
				}
				
				for(WebElement daylist : calenderdaylist)
				{
					 String daydatenumber = daylist.getText();
					 int daynumber = Integer.parseInt(daydatenumber);
					 if(daydatenumber.equals(daynumber))
					 {
						 daylist.click();
					 }
				}	
			} 
		}
	}
	
	public void clickoncreatebutton(String createtextbuttonname) 
	{
		String nameofbutton = createbutton.getText();
		System.out.println("create button name :- "+ nameofbutton);
		if(nameofbutton.equals(createtextbuttonname))
		{
			createbutton.click();
		}
		
		
	}
}


