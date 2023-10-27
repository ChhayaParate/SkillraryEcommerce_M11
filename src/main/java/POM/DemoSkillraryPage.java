package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
  //Declaration
	//address of select category
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	//address of feedback
	@FindBy(name="//a[text()='FEEDBACK']")
	private WebElement feedBckbtn;
	
	//Initialization
	public DemoSkillraryPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	//Utilization 

	public WebElement getSelectDd() {
		return selectDd;
	}

	public WebElement getFeedBckbtn() {
		return feedBckbtn;
	}
   
   //Business Library
	public void feedBckBtn() {
		feedBckbtn.click();
	}
	
	
	
	
	
	
	
	
}
