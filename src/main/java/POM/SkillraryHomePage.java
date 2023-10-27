package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//Declaration
	//Address of gears
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//Address of skillRary demo app
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//Address of search textField 
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchTf;
	
	//Address of search icon
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchIcon;

  //Initialization
	public SkillraryHomePage(WebDriver driver) {
    PageFactory.initElements(driver,this);
	}

	//Utilization
	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}

	public WebElement getSearchTf() {
		return searchTf;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}
	
  //Business Libraries
	public void gearsButton() {
		gearsbtn.click();
	}
	public void skillraryDemoApp() {
		skillrarydemoapp.click();
	}
	public void searchTextField(String data) {
		searchTf.sendKeys(data);
	}
	public void searchicon() {
		searchIcon.click();
	}
 }
